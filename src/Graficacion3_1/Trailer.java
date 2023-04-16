
package Graficacion3_1;

import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.Cone;
import com.sun.j3d.utils.geometry.Cylinder;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.image.TextureLoader;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.LineArray;
import javax.media.j3d.TexCoordGeneration;
import javax.media.j3d.Texture;
import static javax.media.j3d.Texture.RGBA;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.vecmath.AxisAngle4d;
import javax.vecmath.Color3f;
import javax.vecmath.Vector3f;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

/**
 *
 * @author Hp
 */
public class Trailer extends JPanel  {
    
    SimpleUniverse universo;
    TransformGroup escalar;
    TransformGroup perspectiva;
    
    
    Transform3D traslacion;
    Transform3D rotacion;
    Transform3D rotacio2;
    Vector3f posicionVista ;
    
    Color3f[] colorsFill = {
        new Color3f(0.37f, 0.93f, 0.25f),
       // new Color3f(1.0f, 0.0f, 0.0f),
        new Color3f(1.0f, 0.0f, 0.0f),
         new Color3f(1.0f, 0.0f, 0.0f),
         new Color3f(1.0f, 1.0f, 0.0f),
         new Color3f(1.0f, 1.0f, 0.0f),
         new Color3f(1.0f, 1.0f, 0.0f),
         new Color3f(1.0f, 1.0f, 0.0f),
         new Color3f(1.0f, 0.0f, 0.0f),
         new Color3f(1.0f, 0.0f, 0.0f),
         new Color3f(1.0f, 0.92f, 0.0f),
         new Color3f(0.0f, 0.43f, 0.0f),
         new Color3f(0.82f, 0.09f, 0.0f),
         new Color3f(1.0f, 0.0f, 0.0f),
   
    };
    TextureLoader[] texturas = {
        new TextureLoader("C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex1.jpg", this)
      
    };

    public Trailer(){
        
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    
        GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
        Canvas3D canvas = new Canvas3D(config);
        
        setLayout(new BorderLayout());
        add(canvas);
        
        universo = new SimpleUniverse(canvas); 
        //es un vector que hace uso de los tres ejes, ancho, largo y profundidad y que nos permitira definir la vista correspondiente
        
        
        
        posicionVista = new Vector3f(0f, 0f, 30f);
        //objeto para realizar traslacion (de vista no de objeto)
        traslacion = new Transform3D();
        traslacion.setTranslation(posicionVista); //aqui se hace la traslacion con respecto a los valores del Vector3f
        //objeto para realizar rotacion (de vista no de objeto)
        
        // PERSPECTIVA
        rotacion = new Transform3D();
        
        rotacio2 = new Transform3D();
         //Transform3D rotacio3 = new Transform3D();
        
         rotacion.rotY(Math.toRadians(-45)); //se realiza la rotacion con respecto a l eje x
        
         rotacio2.rotX(Math.toRadians(-35));
         //rotacio3.rotZ((Math.toRadians(50)));
      
         //rotacio2.mul(rotacio3);
         rotacion.mul(rotacio2);
       
         rotacion.mul(traslacion); //se combinan los objetos
         
    
        
        universo.getViewingPlatform().getViewPlatformTransform().setTransform(rotacion);
        universo.getViewingPlatform().getViewPlatformTransform().getTransform(traslacion);
        //universo.getViewingPlatform().getViewPlatformTransform().getTransform(transfromVista);
        
        BranchGroup escena = crearGrafoEscena();
        escena.compile();
        
        universo.addBranchGraph(escena);
        
    }
    
    

    
    public BranchGroup crearGrafoEscena() {
        BranchGroup objRaiz = new BranchGroup();
        
        
       
        /*Para rotar*/
        TransformGroup grupoGiro = new TransformGroup(); //transformacion espacial sencilla
        grupoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); //se dan los permisos para poder cambiar el comportamiento
        grupoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_READ); //de objGiro en tiempo de ejecucion. De lectura y escritura
       
        
        //Rotacion------------------------------->
        
         MouseRotate mouseRotacion = new MouseRotate(); //este objeto nos permitira rotar el universo con ayuda del raton
         mouseRotacion.setTransformGroup(grupoGiro);
         mouseRotacion.setSchedulingBounds(new BoundingSphere(new Point3d(), 1000f));
       
       
        //Traslacion ----------------------------->
        /*
        KeyNavigatorBehavior knb = new KeyNavigatorBehavior( grupoGiro); 
        BoundingSphere bs = new BoundingSphere(new Point3d(), 1000f);
        knb.setSchedulingBounds(bs);
        grupoGiro.addChild(knb);*/
        //knb.setTransformGroup(grupoGiro);
        
        //Escalar

         //escalado = new Transform3D();
        // Vector3d escala = new Vector3d(1.0, 1.0, 1.0); // Escala de 2 en los 3 ejes
         //escalado.setScale(escala);
         escalar = new TransformGroup(); 
         escalar.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); //se dan los permisos para poder cambiar el comportamiento
         escalar.setCapability(TransformGroup.ALLOW_TRANSFORM_READ); //de objGiro en tiempo de ejecucion. De lectura y escritura
         
        
       //perspectiva
       perspectiva = new TransformGroup(); 
       perspectiva.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); //se dan los permisos para poder cambiar el comportamiento
       perspectiva.setCapability(TransformGroup.ALLOW_TRANSFORM_READ); //de objGiro en tiempo de ejecucion. De lectura y escritura
        
        
        
        //aUN NO ENTIENDO
       // Vector3f posicionVista = new Vector3f(0f, 0f, 30f);
        //objeto para realizar traslacion (de vista no de objeto)
       // Transform3D traslacion = new Transform3D();
       // traslacion.setTranslation(posicionVista); //aqui se hace la traslacion con respecto a los valores del Vector3f
        //objeto para realizar rotacion (de vista no de objeto)
        
        
        
        
        
     
        
         //rectangulo principal
        Transform3D tras10 = new Transform3D();
        tras10.set(new Vector3f(-.8f, 0.8f, 0.2f));
        Transform3D rot10 = new Transform3D();
        //rot10.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(-90))); 
        rot10.rotX(Math.toRadians(0)); rot10.rotY(Math.toRadians(0)); rot10.rotZ(Math.toRadians(0));
        tras10.mul(rot10);
        TransformGroup tg10 = new TransformGroup(tras10);
        //Cone conoOjo2 = new Cone(0.4f, 1.0f,tomarApariencia(4));
        Box rectangulo4 = new Box(.8f, 0.5f, 0.45f,Box.GENERATE_TEXTURE_COORDS,app(0));
        //rectangulo4.setTexture(tomarTextura(0).getTexture());
       // rectangulo4.setAppearance(tomarTextura(0));
       
        Transform3D tras24 = new Transform3D();
        tras24.setTranslation(new Vector3f(-.7f, 0.8f, 0.65f));   
        tras24.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90))); 
        TransformGroup tg24 = new TransformGroup(tras24);
        Cylinder esfera24 = new Cylinder(0.4f, 0.05f, Cylinder.GENERATE_TEXTURE_COORDS,app(8));
        tg24.addChild(esfera24);
        
         Transform3D tras25 = new Transform3D();
        tras25.setTranslation(new Vector3f(-.7f, 0.8f, -0.25f));   
        tras25.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90))); 
        //tras25.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(180))); 
        TransformGroup tg25 = new TransformGroup(tras25);
        Cylinder esfera25 = new Cylinder(0.4f, 0.05f, Cylinder.GENERATE_TEXTURE_COORDS,app(8));
        tg25.addChild(esfera25);
       
       // esfera.setTextureAttributes(atributosTextura);
        tg10.addChild(rectangulo4);
        
        //rectangulo de abajo
        
         Transform3D tras22 = new Transform3D();
        tras10.set(new Vector3f(-.8f, 0.25f, 0.2f));
        Transform3D rot22 = new Transform3D();
        //rot10.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(-90))); 
        rot22.rotX(Math.toRadians(0)); rot22.rotY(Math.toRadians(0)); rot22.rotZ(Math.toRadians(0));
        tras22.mul(rot22);
        TransformGroup tg22 = new TransformGroup(tras10);
        //Cone conoOjo2 = new Cone(0.4f, 1.0f,tomarApariencia(4));
        Box rectangulo22 = new Box(.8f, 0.06f, 0.45f,Box.GENERATE_TEXTURE_COORDS,app(1));
        tg22.addChild(rectangulo22);
        
        //rectangulo delantero
        Transform3D tras5 = new Transform3D();
        tras5.set((new Vector3f(0.65f, 0.3f, 0.2f)));
        //tras5.set(new Vector3f(0.5f, 0.3f, 0.2f));
        Transform3D rot5 = new Transform3D();
        rot5.rotX(Math.toRadians(0)); rot5.rotY(Math.toRadians(0)); rot5.rotZ(Math.toRadians(0));
        tras5.mul(rot5);
        TransformGroup tg5 = new TransformGroup(tras5);
        //Box cuboBoca1 = new Box(0.16f, 0.16f, 1.0f, tomarApariencia(7));
        Box rectangulo = new Box(0.07f, 0.1f, 0.3f,Box.GENERATE_TEXTURE_COORDS,app(0));
        tg5.addChild(rectangulo);
        
        //rectangulo lateral
        Transform3D tras6 = new Transform3D();
        tras6.set(new Vector3f(0.3f, 0.25f, 0.55f));
        Transform3D rot6 = new Transform3D();
        rot6.rotX(Math.toRadians(0)); rot6.rotY(Math.toRadians(0)); rot6.rotZ(Math.toRadians(0));
        tras6.mul(rot5);
        TransformGroup tg6 = new TransformGroup(tras6);
        //Box cuboBoca2 = new Box(0.16f, 0.16f, 1.0f, tomarApariencia(8));
         Box rectangulo3 = new Box(0.25f, 0.03f, 0.05f, Box.GENERATE_TEXTURE_COORDS,app(1));
        tg6.addChild(rectangulo3);
        
          //rectangulo lateral
        Transform3D tras9 = new Transform3D();
        tras9.set(new Vector3f(0.3f, 0.25f, -0.17f));
        Transform3D rot9 = new Transform3D();
        //rot9.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(-90))); 
        rot9.rotX(Math.toRadians(0)); rot9.rotY(Math.toRadians(0)); rot9.rotZ(Math.toRadians(0));
        tras9.mul(rot9);
        TransformGroup tg9 = new TransformGroup(tras9);
        //Cone conoOjo1 = new Cone(0.4f, 1.0f,tomarApariencia(4));
         Box rectangulo2 = new Box(0.25f, 0.03f, 0.05f,Box.GENERATE_TEXTURE_COORDS,app(1) );
        tg9.addChild(rectangulo2);
        
        
        
        //luz
        Transform3D tras7 = new Transform3D();
        tras7.set(new Vector3f(0.7f, 0.3f, 0.4f));
        Transform3D rot7 = new Transform3D();
        rot7.rotX(Math.toRadians(0)); rot7.rotY(Math.toRadians(0)); rot7.rotZ(Math.toRadians(0));
        tras7.mul(rot7);
        TransformGroup tg7 = new TransformGroup(tras7);
        //Box cuboBoca3 = new Box(0.16f, 0.16f, 1.0f, tomarApariencia(8));
        Sphere esfera2 = new Sphere(0.1f,Sphere.GENERATE_TEXTURE_COORDS,app(7));
        tg7.addChild(esfera2);
        
        
        //luz
        Transform3D tras8 = new Transform3D();
        tras8.set(new Vector3f(0.7f, 0.3f, 0.0f));
        Transform3D rot8 = new Transform3D();
        rot8.rotX(Math.toRadians(0)); rot8.rotY(Math.toRadians(0)); rot8.rotZ(Math.toRadians(0));
       // rot8.rotX(Math.PI/2); rot8.rotY(Math.toRadians(0)); rot8.rotZ(Math.PI/2);
        tras8.mul(rot8);
        TransformGroup tg8 = new TransformGroup(tras8);
        //Box cuboBoca4 = new Box(0.16f, 0.16f, 1.0f, tomarApariencia(7));
        Sphere esfera = new Sphere(0.1f,Sphere.GENERATE_TEXTURE_COORDS,app(7)); //Tamaño esfera (0.3)
        tg8.addChild(esfera);
        
        
        
         Transform3D tras26 = new Transform3D();
        tras26.set(new Vector3f(-1.6f, 0.25f, 0.47f));
        Transform3D rot26 = new Transform3D();
        rot26.rotX(Math.toRadians(0)); rot26.rotY(Math.toRadians(0)); rot26.rotZ(Math.toRadians(0));
        tras26.mul(rot7);
        TransformGroup tg26 = new TransformGroup(tras26);
        //Box cuboBoca3 = new Box(0.16f, 0.16f, 1.0f, tomarApariencia(8));
        Sphere esfera26 = new Sphere(0.07f,Sphere.GENERATE_TEXTURE_COORDS,app(9));
        tg26.addChild(esfera26);
        
        //luz
        Transform3D tras27 = new Transform3D();
        tras27.set(new Vector3f(-1.6f, 0.25f, -0.07f));
        Transform3D rot27 = new Transform3D();
        rot27.rotX(Math.toRadians(0)); rot27.rotY(Math.toRadians(0)); rot27.rotZ(Math.toRadians(0));
       // rot8.rotX(Math.PI/2); rot8.rotY(Math.toRadians(0)); rot8.rotZ(Math.PI/2);
        tras27.mul(rot27);
        TransformGroup tg27 = new TransformGroup(tras27);
        //Box cuboBoca4 = new Box(0.16f, 0.16f, 1.0f, tomarApariencia(7));
        Sphere esfera27 = new Sphere(0.07f,Sphere.GENERATE_TEXTURE_COORDS,app(9)); //Tamaño esfera (0.3)
        tg27.addChild(esfera27);

        
       
        
        //crear cilindro
        Transform3D tras11 = new Transform3D();
        tras11.set(new Vector3f(0.1f, 0.65f, -0.10f));
        Transform3D rot11 = new Transform3D();
        rot11.setRotation(new AxisAngle4d(0,0,0,Math.toRadians(0))); 
        tras11.mul(rot11);
        TransformGroup tg11 = new TransformGroup(tras11);
       // Sphere sferaCornea1 = new Sphere(0.2f,tomarApariencia(6));
       Cylinder cilindro1 =new Cylinder(0.05f,0.8f,Cylinder.GENERATE_TEXTURE_COORDS,app(6));
        tg11.addChild(cilindro1);
        
        //crear cilindro2
        Transform3D tras12 = new Transform3D();
        tras12.set(new Vector3f(0.1f, 0.65f, 0.5f));
        Transform3D rot12 = new Transform3D();
        rot12.setRotation(new AxisAngle4d(0,0,0,Math.toRadians(0)));
        tras12.mul(rot12);
        TransformGroup tg12 = new TransformGroup(tras12);
        //Sphere sferaCornea2 = new Sphere(0.2f,tomarApariencia(5));
        Cylinder cilindro2 =new Cylinder(0.05f,0.8f,Cylinder.GENERATE_TEXTURE_COORDS,app(6));
        tg12.addChild(cilindro2);
        
        //cubo cabina
        Transform3D tras13 = new Transform3D();
        tras13.set(new Vector3f(0.3f, 0.5f, 0.2f));
        Transform3D rot13 = new Transform3D();
        rot13.setRotation(new AxisAngle4d(0,0,0,Math.toRadians(0))); 
        tras13.mul(rot13);
        TransformGroup tg13 = new TransformGroup(tras13);
        //Box cuboAntena = new Box(0.08f, 0.5f, 0.08f,tomarApariencia(3));
          Box cubo = new Box(0.3f, 0.3f, 0.3f, Box.GENERATE_TEXTURE_COORDS,app(2) );
        tg13.addChild(cubo);
  
        
        //cubo ventana
        Transform3D tras14 = new Transform3D();
        tras14.set(new Vector3f(0.38f, 0.6f, 0.5f));
        Transform3D rot14 = new Transform3D();
        rot14.setRotation(new AxisAngle4d(0,0,0,Math.toRadians(0))); 
        tras14.mul(rot14);
        TransformGroup tg14 = new TransformGroup(tras14);
        //Sphere esferaAntena = new Sphere(0.3f,tomarApariencia(6));
          Box cubo2 = new Box(0.15f, 0.12f, 0.01f, Box.GENERATE_TEXTURE_COORDS,app(4) );
        tg14.addChild(cubo2);
        
        //cubo ventana
        Transform3D tras15 = new Transform3D();
        tras15.set(new Vector3f(0.38f, 0.6f, -0.10f));
        Transform3D rot15 = new Transform3D();
        rot15.setRotation(new AxisAngle4d(0,0,0,Math.toRadians(0))); 
        tras15.mul(rot15);
        TransformGroup tg15 = new TransformGroup(tras15);
        //Box cuboB1 = new Box(0.2f,0.1f, 0.1f,tomarApariencia(2));
        Box cubo3 = new Box(0.15f, 0.12f, 0.01f, Box.GENERATE_TEXTURE_COORDS, app(4));
        tg15.addChild(cubo3);
        
        
        
        //cubo ventana frontal
        Transform3D tras23 = new Transform3D();
        tras23.set(new Vector3f(0.6f, 0.6f, 0.2f));
        Transform3D rot23 = new Transform3D();
        rot23.setRotation(new AxisAngle4d(0,0,0,Math.toRadians(0))); 
        tras23.mul(rot23);
        TransformGroup tg23 = new TransformGroup(tras23);
        //Box cuboB1 = new Box(0.2f,0.1f, 0.1f,tomarApariencia(2));
        Box cubo23 = new Box(0.01f, 0.15f, 0.20f, Box.GENERATE_TEXTURE_COORDS, app(3));
        tg23.addChild(cubo23);
        
        
        //ruedas
   
        Transform3D tras4 = new Transform3D();
        tras4.set(new Vector3f(0.4f, 0.02f, 0f));
        tras4.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90))); 
        TransformGroup tg4 = new TransformGroup(tras4);
        Cylinder cilindro = new Cylinder(0.2f, 0.1f, Cylinder.GENERATE_TEXTURE_COORDS,app(5));
        tg4.addChild(cilindro);
        
        
        Transform3D tras16 = new Transform3D();
        tras16.setTranslation(new Vector3f(0.4f, 0.02f, 0.4f));
        tras16.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90))); 
        TransformGroup tg16 = new TransformGroup(tras16);
        Cylinder esfera4 = new Cylinder(0.2f, 0.1f,Cylinder.GENERATE_TEXTURE_COORDS, app(5));
        tg16.addChild(esfera4);
        
        //llanta de enmedio
        Transform3D tras17 = new Transform3D();
        tras17.setTranslation(new Vector3f(-0.7f, 0.02f, 0.4f));   
        tras17.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90))); 
        TransformGroup tg17 = new TransformGroup(tras17);
        Cylinder esfera3 = new Cylinder(0.2f, 0.1f, Cylinder.GENERATE_TEXTURE_COORDS,app(5));
        tg17.addChild(esfera3);
        
       //llanta de enmedio
        Transform3D tras18 = new Transform3D();
        tras18.set(new Vector3f(-0.7f, 0.02f, 0.0f));
        tras18.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90)));
        TransformGroup tg18 = new TransformGroup(tras18);
        Cylinder esfera5= new Cylinder(0.2f, 0.1f, Cylinder.GENERATE_TEXTURE_COORDS,app(5));
        tg18.addChild(esfera5);
        
       //llanta trasera
        Transform3D tras19 = new Transform3D();
        tras19.set(new Vector3f(-1.2f, 0.02f, 0.0f));
        tras19.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90)));
        TransformGroup tg19 = new TransformGroup(tras19);
        Cylinder esfera7 = new Cylinder(0.2f, 0.1f,Cylinder.GENERATE_TEXTURE_COORDS, app(5));
        tg19.addChild(esfera7);
        
       //llanta trasera
        Transform3D tras20 = new Transform3D();
        tras20.set(new Vector3f(-1.2f, 0.02f, 0.4f));
        tras20.setRotation(new AxisAngle4d(1,0,0,Math.toRadians(90)));
        TransformGroup tg20 = new TransformGroup(tras20);
        Cylinder esfera6 = new Cylinder(0.2f, 0.1f,Cylinder.GENERATE_TEXTURE_COORDS, app(5));
        tg20.addChild(esfera6);
        
      
        
        //se agregan todas los objetos TransformGroup que contengan figuras, al objeto 'grupoGiro' para poder girarlas
        //grupoGiro.addChild(tg1);
       
        grupoGiro.addChild(tg4);
        grupoGiro.addChild(tg5);
        grupoGiro.addChild(tg6);
        grupoGiro.addChild(tg7);
        grupoGiro.addChild(tg8);
        grupoGiro.addChild(tg9);
        grupoGiro.addChild(tg10);
        grupoGiro.addChild(tg11);
        grupoGiro.addChild(tg12);
        grupoGiro.addChild(tg13);
        grupoGiro.addChild(tg14);
        grupoGiro.addChild(tg15);
        grupoGiro.addChild(tg16);
        grupoGiro.addChild(tg17);
        grupoGiro.addChild(tg18);
        grupoGiro.addChild(tg19);
        grupoGiro.addChild(tg20);
        grupoGiro.addChild(tg22);
        grupoGiro.addChild(tg23);
          grupoGiro.addChild(tg24);
          grupoGiro.addChild(tg25);
         grupoGiro.addChild(tg26);
          grupoGiro.addChild(tg27);
        
        
        
        escalar.addChild(grupoGiro);
        perspectiva.addChild(escalar);
        objRaiz.addChild(perspectiva); //se agrega objGiro a objRaiz
        objRaiz.addChild(mouseRotacion);
       
        
        return objRaiz;
    }
   
    public Appearance tomarApariencia(int i){
        
        /*Para dar apariencia*/
        Appearance apariencia = new Appearance();
        Color3f color = new Color3f(colorsFill[i]);
        ColoringAttributes ca = new ColoringAttributes();
        ca.setColor(color);
        apariencia.setColoringAttributes(ca);
        return apariencia;
    } 
     
      public Appearance tomarTextura(int i){
          
        TextureAttributes atributosTextura = new TextureAttributes();
        atributosTextura.setTextureMode(TextureAttributes.REPLACE);
  
        Texture textura = texturas[i].getTexture();
          System.out.println(textura.getEnable());
        
        /*Para dar apariencia*/
        Appearance apariencia = new Appearance();
        apariencia.setTexture(textura);
        apariencia.setTextureAttributes(atributosTextura);
        
        return apariencia;
    } 
      String Ruta;
      Appearance app(int i){
      Appearance apariencia=new Appearance();
    //  TexCoordGeneration texCoord=new TexCoordGeneration(  TexCoordGeneration.OBJECT_LINEAR,TexCoordGeneration.TEXTURE_COORDINATE_2 );
    //TexCoordGeneration texCoord = new TexCoordGeneration(TexCoordGeneration.SPHERE_MAP, TexCoordGeneration.TEXTURE_COORDINATE_3);
   // TexCoordGeneration texCoord = new TexCoordGeneration(TexCoordGeneration.SPHERE_MAP, TexCoordGeneration.TEXTURE_COORDINATE_3);

      //apariencia.setTexCoordGeneration(texCoord);
     if (i==0){
       Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex1.jpg";}
      if(i==1){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex2.jpg";
      }
      if(i == 2){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex3.jpg";
      }
      if(i == 3){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex4.jpg";
      }
       if(i == 4){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex5.jpg";
      }
       if(i == 5){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex6.jpg";
      }
        if(i == 6){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex7.jpg";
      }
        if(i == 7){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex8.jpg";
      }
         if(i == 8){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex10.jpg";
      }
         if(i == 9){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\graficacion3_1\\tex11.jpg";
      }
      TextureLoader loader=new TextureLoader(Ruta,this);
      ImageComponent2D imagen= loader.getImage();
      Texture2D textura=new Texture2D(
              Texture.BASE_LEVEL,RGBA,imagen.getWidth(),imagen.getHeight());
      textura.setImage(0, imagen);
      textura.setEnable(true);
      textura.setMagFilter(Texture.BASE_LEVEL_LINEAR);
      textura.setMinFilter(Texture.BASE_LEVEL_LINEAR);
      apariencia.setTexture(textura);
      apariencia.setTextureAttributes(new TextureAttributes());
      return apariencia;
     }
      Appearance app1(int i){
      Appearance apariencia=new Appearance();
    TexCoordGeneration texCoord=new TexCoordGeneration(  TexCoordGeneration.OBJECT_LINEAR,TexCoordGeneration.TEXTURE_COORDINATE_2 );
   // TexCoordGeneration texCoord = new TexCoordGeneration(TexCoordGeneration.SPHERE_MAP, TexCoordGeneration.TEXTURE_COORDINATE_3);

      apariencia.setTexCoordGeneration(texCoord);
      if (i==0){
       Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Graficacion3_1\\src\\imagenes/tex1.jpg";}
      if(i==1){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Graficacion3_1\\src\\imagenes/tex2.jpg";
      }
      TextureLoader loader=new TextureLoader(Ruta,this);
      ImageComponent2D imagen= loader.getImage();
      Texture2D textura=new Texture2D(
              Texture.BASE_LEVEL,RGBA,imagen.getWidth(),imagen.getHeight());
      textura.setImage(0, imagen);
      textura.setEnable(true);
      textura.setMagFilter(Texture.BASE_LEVEL_LINEAR);
      textura.setMinFilter(Texture.BASE_LEVEL_LINEAR);
      apariencia.setTexture(textura);
      apariencia.setTextureAttributes(new TextureAttributes());
      return apariencia;
     }
    
    public static void main(String[]args){
        System.setProperty("sun.awt.noerasebackgroud", "true"); //evitara que la aplicacion parpadee
        JFrame frame = new JFrame();
        Trailer f = new Trailer(); 
        frame.add(f);
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
     
     Transform3D escalado;
      private double scaleValue = 1.0;
      private double sesgoValueX = 0.0;
      private double sesgoValueY = 0.0;
      

   
     private void updateScale() {
        // Crear una nueva Transform3D con la escala actualizada y aplicarla al TransformGroup
        Transform3D escalado = new Transform3D();
        Vector3d escala = new Vector3d(scaleValue, scaleValue, scaleValue);
        escalado.setScale(escala);
        escalar.setTransform(escalado);
    }
     
      
     
     private void  sesgarX(){
          Transform3D sesgado = new Transform3D();
                sesgado.set(new double[] {
                        1.0, sesgoValueY, 0.0, 0.0,
                        sesgoValueX, 1.0, 0.0, 0.0,
                        0.0, 0.0, 1.0, 0.0,
                        0.0, 0.0, 0.0, 1.0
                 }); // sesgado en el eje x

                //TransformGroup tg = new TransformGroup();
                perspectiva.setTransform(sesgado);
                //.addChild(figura);
     
     }
      private void  sesgarY(){
          Transform3D sesgado = new Transform3D();
                sesgado.set(new double[] {
                        1.0, sesgoValueY, 0.0, 0.0,
                        sesgoValueX, 1.0, 0.0, 0.0,
                        0.0, 0.0, 1.0, 0.0,
                        0.0, 0.0, 0.0, 1.0
                 }); // sesgado en el eje x

                //TransformGroup tg = new TransformGroup();
                perspectiva.setTransform(sesgado);
                //.addChild(figura);
     
     }

    
}