/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Laberinto;

import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.behaviors.keyboard.KeyNavigatorBehavior;
import com.sun.j3d.utils.behaviors.mouse.MouseRotate;
import com.sun.j3d.utils.geometry.Box;
import com.sun.j3d.utils.geometry.GeometryInfo;
import com.sun.j3d.utils.geometry.NormalGenerator;
import com.sun.j3d.utils.geometry.Sphere;
import com.sun.j3d.utils.universe.SimpleUniverse;
import java.applet.Applet;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import javax.media.j3d.Appearance;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Canvas3D;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Color3f;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3f;
import com.sun.j3d.utils.image.TextureLoader;
import Graficacion3_1.Trailer;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.media.j3d.AmbientLight;
import javax.media.j3d.Background;
import javax.media.j3d.BoundingSphere;
import javax.media.j3d.ColoringAttributes;
import javax.media.j3d.DirectionalLight;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Material;
import javax.media.j3d.TexCoordGeneration;
import javax.media.j3d.Texture;
import static javax.media.j3d.Texture.RGBA;
import javax.media.j3d.Texture2D;
import javax.media.j3d.TextureAttributes;
import javax.swing.JOptionPane;
import javax.vecmath.Point3d;





public class Laberinto  extends Applet {
    String Ruta;
    float vista=-4;
    Vector3f par1= new Vector3f(-0.16f, -0.55f, -0.5f);//0.35f, -0.35f,-0.5f
    Vector3f par2= new Vector3f(0.35f, -0.35f,-0.5f);
    Vector3f par3= new Vector3f(0.38f, 0.28f, -0.5f);
    Vector3f par4=new Vector3f(-0.3f, 0.32f, -0.5f);
    Vector3f par5=new Vector3f(0.12f, 0.48f, -0.5f);
    Vector3f par6=new Vector3f(-0.48f, -0.08f, -0.5f);
    Vector3f interna2=new Vector3f(-0.14f,0.35f, -0.5f);
    Vector3f interna1=new Vector3f(0.02f,0.37f, -0.5f);
    Vector3f interna3 =new Vector3f(0.22f,0.4f, -0.5f);
    Vector3f interna4=new Vector3f(0.12f,0.32f, -0.5f);
    Vector3f interna5=new Vector3f(0.038f,0.22f, -0.5f);
    Vector3f interna6=new Vector3f(-0.07f,0.15f, -0.5f);
    Vector3f interna7=new Vector3f(-0.18f,0.27f, -0.5f);
Vector3f interna71=new Vector3f(-0.2f,0.15f, -0.5f);
Vector3f interna8= new Vector3f(0.29f,0.32f, -0.5f);
Vector3f interna9 = new Vector3f(-0.35f,0.18f, -0.5f);
Vector3f interna10= new Vector3f(-0.07f,0.05f, -0.5f);
Vector3f interna11= new Vector3f(0.13f,0.135f, -0.5f);
Vector3f interna12= new Vector3f(0.38f,0.213f, -0.5f);
Vector3f interna13 = new Vector3f(0.34f,0.18f, -0.5f);
Vector3f interna14= new Vector3f(0.27f,0.07f, -0.5f);
Vector3f interna15= new Vector3f(0.2f,0.05f, -0.5f);
Vector3f interna16= new Vector3f(0.3f,0.02f, -0.5f);
Vector3f interna17= new Vector3f(0.33f,-0.01f, -0.5f);
Vector3f interna18= new Vector3f(0.31f,-0.05f, -0.5f);
Vector3f interna19= new Vector3f(0.1f,-0.17f, -0.5f);
Vector3f interna20= new Vector3f(-0.28f,-0.05f, -0.5f);
Vector3f interna21= new Vector3f(-0.19f,-0.09f, -0.5f);
Vector3f interna22=  new Vector3f(-0.14f,-0.13f, -0.5f);
Vector3f interna23= new Vector3f(-0.1f,-0.16f, -0.5f);
Vector3f interna23i2= new Vector3f(0.0f,-0.167f, -0.5f);
Vector3f interna22i2=  new Vector3f(-0.12f,-0.295f, -0.5f);
Vector3f interna23i4=  new Vector3f(0.05f,-0.23f, -0.5f);
Vector3f interna24= new Vector3f(-0.23f,-0.24f, -0.5f);
Vector3f interna25=  new Vector3f(-0.4f,-0.2f, -0.5f);
Vector3f interna26=  new Vector3f(-0.3f,-0.38f, -0.5f);
Vector3f interna27=  new Vector3f(-0.32f,-0.42f, -0.5f);
Vector3f interna28=  new Vector3f(-0.01f,-0.55f, -0.5f);
Vector3f interna29=  new Vector3f(0.245f,-0.16f, -0.5f);
Vector3f interna30 =  new Vector3f(0.14f,-0.385f, -0.5f);
Vector3f interna31= new Vector3f(0.18f,-0.36f, -0.5f);
Vector3f interna33= new Vector3f(0.29f,-0.25f, -0.5f);
Vector3f interna34=  new Vector3f(0.314f,-0.2f, -0.5f);
Vector3f interna35 = new Vector3f(0.33f,-0.23f, -0.5f);
Vector3f interna36 =  new Vector3f(0.37f,-0.3f, -0.5f);
Vector3f interna37= new Vector3f(0.4f,-0.25f, -0.5f);
Vector3f interna38= new Vector3f(0.5f,-0.12f, -0.5f);
Vector3f interna39=  new Vector3f(0.54f,-0.065f, -0.5f);
Vector3f interna40= new Vector3f(0.425f,0.07f, -0.5f);
Vector3f vectiniciarl ;
 BranchGroup escena ;
  Canvas3D canvas3D ;
  
SimpleUniverse simpleU;

    Vector3f[] vectoresParedes;
    public Laberinto() {
        vectiniciarl = new Vector3f(-0.09f,0.39f,-0.5f) ; 
    setLayout(null);
    vectoresParedes=new Vector3f[] {par1,par2,par3,par4,par5,par6,interna2,interna1,interna3,
    interna7, interna71, interna8, interna9, interna10, interna11, interna12, interna13, interna14, 
    interna15, interna16, interna17, interna18, interna19, interna20, interna21, interna22, interna23, 
    interna23i2, interna22i2, interna23i4, interna24, interna25, interna26, interna27, interna28,interna29, 
    interna30, interna31 , interna33, interna34, interna35, interna36 , interna37, interna38, interna39, interna40
};
    GraphicsConfiguration config = SimpleUniverse.getPreferredConfiguration();
     canvas3D = new Canvas3D(config);
    canvas3D.setBounds(0, -300, 1950, 1100); // Cambiar tamaño a 800x600
    
    add("Center", canvas3D);
    
    // Crea un nuevo universo 3D simple, pasándole el objeto Canvas3D como parámetro
     simpleU = new SimpleUniverse(canvas3D);
     escena = crearEscenaGrafico(canvas3D, simpleU);
  
     Transform3D transform = new Transform3D();
    
    simpleU.getViewingPlatform().setNominalViewingTransform();
    simpleU.addBranchGraph(escena);
    
    
    canvas3D.setFocusable(true);
    canvas3D.requestFocus();
}

     public BranchGroup crearEscenaGrafico(Canvas3D canvas3D,  SimpleUniverse simpleU  ) { 
        MouseRotate mouseRot = new MouseRotate();
        TransformGroup grupoGiro = new TransformGroup();
        
          grupoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); //se dan los permisos para poder cambiar el comportamiento
        grupoGiro.setCapability(TransformGroup.ALLOW_TRANSFORM_READ); //de objGiro en tiempo de ejecucion. De lectura y escritura
        BranchGroup objPrincipal = new BranchGroup();
        
        
        
        Color3f colorAmbiente = new Color3f(Color.DARK_GRAY);
        AmbientLight luzAmbiente = new AmbientLight(colorAmbiente);
        luzAmbiente.setInfluencingBounds(new BoundingSphere(new Point3d(0,0,0),100));
        
        Color3f colorLuz = new Color3f(Color.WHITE);
        Vector3f dirLuz = new Vector3f(-.6f,-.6f,-.6f);
        DirectionalLight luz = new DirectionalLight(colorLuz,dirLuz);
        luz.setInfluencingBounds(new BoundingSphere(new Point3d(0,0,0),100));
        
        objPrincipal.addChild(luzAmbiente);
        objPrincipal.addChild(luz);
        
         Trailer ac=new Trailer();
             
           
        BufferedImage img = null;
    try {
        img = ImageIO.read(new File("C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\laberinto\\fondito1.jpg"));
    } catch (IOException e) {
        System.err.println("No se pudo cargar la imagen.");
        e.printStackTrace();
    }
        ImageComponent2D imagenDeFondo = new ImageComponent2D(ImageComponent2D.FORMAT_RGB, img);
        Background fondo=new Background(new Color3f(Color.white));
         fondo.setImage(imagenDeFondo);
        fondo.setApplicationBounds(new BoundingSphere());
        objPrincipal.addChild(fondo);
        canvas3D.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              // mouseRot.setTransformGroup(grupoGiro);
               //mouseRot.setSchedulingBounds(new BoundingSphere(new Point3d(), 1000f));
                 mouseRot.setFactor(0.02);
                   mouseRot.setTransformGroup(simpleU.getViewingPlatform().getViewPlatformTransform());
                    // Establece el área de activación del MouseRotate
                    mouseRot.setSchedulingBounds(new BoundingSphere());
            }
            });
         TransformGroup esc; esc = new TransformGroup();
             esc.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); //se dan los permisos para poder cambiar el comportamiento
        esc.setCapability(TransformGroup.ALLOW_TRANSFORM_READ); //de objGiro en tiempo de ejecucion. De lectura y escritura
             esc.addChild(ac.crearGrafoEscena());
             Transform3D escala = new Transform3D();                       
           escala.setTranslation(vectiniciarl);
             escala.setScale(0.03);
             esc.setTransform(escala);
             KeyNavigatorBehavior knb = new KeyNavigatorBehavior( grupoGiro); 
        BoundingSphere bs = new BoundingSphere(new Point3d(), 1000f);
        knb.setSchedulingBounds(bs);       
       grupoGiro.addChild(knb);
             canvas3D.addKeyListener(new KeyAdapter() {
    @Override
    public void keyPressed(KeyEvent e) {
        // Acciones cuando se presiona una tecla
        System.out.println("x="+vectiniciarl.x+", ");
         System.out.println("y="+vectiniciarl.y+", ");
        if (e.getKeyChar() == 'a') {
           
            Vector3f siguiente=new Vector3f ( vectiniciarl.x-0.001f, vectiniciarl.y,vectiniciarl.z) ;
                      boolean ac= detectarPared(siguiente,3);
            
             if (ac==true){
            vectiniciarl=siguiente;
            // Crear la nueva transformación con la nueva posición
            Transform3D nuevaTransformacion = new Transform3D();
            nuevaTransformacion.setTranslation(vectiniciarl);
            nuevaTransformacion.setScale(0.03);
            // Establecer la nueva transformación en el TransformGroup del objeto
            esc.setTransform(nuevaTransformacion);}

            // Indicar que se ha modificado el TransformGroup
           
           
        } else if (e.getKeyChar() == 's') {
            
             Vector3f siguiente=new Vector3f ( vectiniciarl.x, vectiniciarl.y-0.001f,vectiniciarl.z) ;
            boolean ac= detectarPared(siguiente,2);
            
             if (ac==true){
            vectiniciarl=siguiente;
            // Crear la nueva transformación con la nueva posición
            Transform3D nuevaTransformacion = new Transform3D();
            nuevaTransformacion.setTranslation(vectiniciarl);
            nuevaTransformacion.setScale(0.03);

            // Establecer la nueva transformación en el TransformGroup del objeto
            esc.setTransform(nuevaTransformacion);}

           
        } else if (e.getKeyChar() == 'd') {
            
             Vector3f siguiente=new Vector3f ( vectiniciarl.x+0.001f, vectiniciarl.y,vectiniciarl.z) ;
           detectarPared(siguiente,4);
            vectiniciarl=siguiente;
            // Crear la nueva transformación con la nueva posición
            Transform3D nuevaTransformacion = new Transform3D();
            nuevaTransformacion.setTranslation(vectiniciarl);
            nuevaTransformacion.setScale(0.03);

            // Establecer la nueva transformación en el TransformGroup del objeto
            esc.setTransform(nuevaTransformacion);

            // Indicar que se ha modificado el TransformGroup
            
                      
           
            System.out.println("Tecla d presionada");
        } else if (e.getKeyChar() == 'w') {
              Vector3f siguiente=new Vector3f ( vectiniciarl.x, vectiniciarl.y+0.001f,vectiniciarl.z) ;
             boolean ac= detectarPared(siguiente,1);
             if (ac==true){
            vectiniciarl=siguiente;
            // Crear la nueva transformación con la nueva posición
            Transform3D nuevaTransformacion = new Transform3D();
            nuevaTransformacion.setTranslation(vectiniciarl);
            nuevaTransformacion.setScale(0.03);

            // Establecer la nueva transformación en el TransformGroup del objeto
            esc.setTransform(nuevaTransformacion);}

            // Indicar que se ha modificado el TransformGroup
           
            System.out.println("Tecla w presionada");
        }
    }
});             
            grupoGiro.addChild(esc);
          grupoGiro.addChild(mouseRot);
          grupoGiro.addChild(CrearPentagono());                        
          grupoGiro.addChild(CraearPardeLimite1());
          grupoGiro.addChild(CraearPardeLimite2());
          grupoGiro.addChild(CraearPardeLimite3());
          grupoGiro.addChild(CraearPardeLimite4());
          grupoGiro.addChild(CraearPardeLimite5());
          grupoGiro.addChild(CraearPardeLimite6());//CraearPardeInterna1
          grupoGiro.addChild(CraearPardeInterna1());
          grupoGiro.addChild(CraearPardeInterna2());         
          grupoGiro.addChild(CraearPardeInterna3());         
          grupoGiro.addChild(CraearPardeInterna4());
          grupoGiro.addChild(CraearPardeInterna5());
          grupoGiro.addChild(CraearPardeInterna6());
          grupoGiro.addChild(CraearPardeInterna7());
          grupoGiro.addChild(CraearPardeInterna71());//
          grupoGiro.addChild(CraearPardeInterna8());
          grupoGiro.addChild(CraearPardeInterna9());
          grupoGiro.addChild(CraearPardeInterna10());//
          grupoGiro.addChild(CraearPardeInterna11());
          grupoGiro.addChild(CraearPardeInterna12());
          grupoGiro.addChild(CraearPardeInterna13());
          grupoGiro.addChild(CraearPardeInterna14());
          grupoGiro.addChild(CraearPardeInterna15());
          grupoGiro.addChild(CraearPardeInterna16());
          grupoGiro.addChild(CraearPardeInterna17());
          grupoGiro.addChild(CraearPardeInterna18());
          grupoGiro.addChild(CraearPardeInterna19());
          grupoGiro.addChild(CraearPardeInterna20());
          grupoGiro.addChild(CraearPardeInterna21());
          grupoGiro.addChild(CraearPardeInterna22());
          grupoGiro.addChild(CraearPardeInterna23());
          grupoGiro.addChild(CraearPardeInterna23i2());
          grupoGiro.addChild(CraearPardeInterna22i2());
          grupoGiro.addChild(CraearPardeInterna23i4());
          grupoGiro.addChild(CraearPardeInterna24());
          grupoGiro.addChild(CraearPardeInterna25());
          grupoGiro.addChild(CraearPardeInterna26());
          grupoGiro.addChild(CraearPardeInterna27());
          grupoGiro.addChild(CraearPardeInterna28());
          grupoGiro.addChild(CraearPardeInterna29());
          grupoGiro.addChild(CraearPardeInterna30());
          grupoGiro.addChild(CraearPardeInterna31());
          grupoGiro.addChild(CraearPardeInterna33());
          grupoGiro.addChild(CraearPardeInterna34());
          grupoGiro.addChild(CraearPardeInterna35());
          grupoGiro.addChild(CraearPardeInterna36());
          grupoGiro.addChild(CraearPardeInterna37());
          grupoGiro.addChild(CraearPardeInterna38());
          grupoGiro.addChild(CraearPardeInterna39());
          grupoGiro.addChild(CraearPardeInterna40());
         
          objPrincipal.addChild(grupoGiro);
          return objPrincipal;
     
     }
    
     public boolean detectarPared(  Vector3f siguientePosicion, int indicador) {
         float[] puntosx = {-0.120000064f,-0.120000064f,-0.120000064f,-0.120000064f,-0.11900006f,-0.11800006f,-0.11700006f,-0.116000056f,-0.115000054f};
        float[] puntosy = {0.3580004f,0.3570004f,0.35600042f,0.35500044f,0.35500044f,0.35500044f,0.35500044f,0.35500044f,0.35500044f};
       
           
        if (indicador==1){           
            //afecta a w que va para arriba en las y
            int aux=0;
            for (int i=0;i<puntosx.length;i++){
                if (puntosy[i]>siguientePosicion.y){
                    float dife=puntosy[i]-siguientePosicion.y;
                   
                    if (dife<0.06f){
                       
                      float dife2=Math.abs(puntosx[i]-siguientePosicion.x);
                       System.out.println(siguientePosicion.x+" i"+i+"res"+puntosx[i]+"-"+siguientePosicion.x+"="+dife2);
                       if (dife2<0.06f){
                    return false;}
                   
                    }                    
                }            
            }            
        }
        if(indicador==3){
        //afecta a A que va para atras afecta a x
            int aux=0;
            for (int i=0;i<puntosx.length;i++){
               
                if (puntosx[i]<siguientePosicion.x){
                    
                    float dife=puntosx[i]-siguientePosicion.x;
                  
                    if (dife<0.06f){
                      float dife2=puntosy[i]-siguientePosicion.y;  
                      
                    if (dife2<0.05f){
                      
                    return false;
                   
                    }
                   
                    }                    
                }            
            }            
        }
        return true;
}
     private TransformGroup CrearPentagono() {
         
         
        
                TransformGroup giro = new TransformGroup();
                giro.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE); 

                
                //giro.addChild(luzAmbiente);
              //  giro.addChild(luz);
                
                
                Point3f[] vertices = new Point3f[10];
              float radius = 0.6f;
            for (int i = 0; i < 5; i++) {
                float angle = (float) (2 * Math.PI * i / 5);
                vertices[i] = new Point3f(radius * (float) Math.cos(angle), -0.5f, radius * (float) Math.sin(angle));
                vertices[i+5] = new Point3f(radius * (float) Math.cos(angle), 0.5f, radius * (float) Math.sin(angle));
            }

                int[] indices = {
                        // Cara inferior
                0, 1, 2,
                0, 2, 3,
                0, 3, 4,
                0, 4, 5,
                0, 5, 1,
                // Cara superior
                6, 8, 7,
                6, 9, 8,
                6, 5, 9,
                6, 1, 5,
                6, 7, 1,
                // Caras laterales
                1, 7, 2,
                2, 7, 8,
                2, 8, 3,
                3, 8, 9,
                3, 9, 4,
                4, 9, 5,
                5, 9, 6,
                6, 9, 1,
                7, 8, 2
                };

                GeometryInfo gi = new GeometryInfo(GeometryInfo.TRIANGLE_ARRAY);
                gi.setCoordinates(vertices);
                gi.setCoordinateIndices(indices);
                NormalGenerator ng = new NormalGenerator();
                ng.generateNormals(gi);

                Shape3D pentagono = new Shape3D(gi.getGeometryArray(),tomarTextura(0));

                giro.addChild(pentagono);
                Transform3D escala = new Transform3D();               
                escala.setScale(0.05);
                giro.setTransform(escala);
                
                
                // Alejar la figura de la cámara
                Transform3D traslacion = new Transform3D();               
                traslacion.rotX(Math.PI / 2);
                traslacion.setTranslation(new Vector3f(0f, -0.06f, -1f));
                
                giro.setTransform(traslacion);
                return giro;
}

      
       private TransformGroup CraearPardeLimite1() {
          // Crear el grupo de transformación
        TransformGroup giro = new TransformGroup();
        // Crear el cubo
        Box box = new Box(0.01f, 0.05f, 0.35f, Box.GENERATE_NORMALS, app(1));

        // Agregar el cubo al grupo de transformación
        giro.addChild(box);

        // Rotar el cubo alrededor del eje X y del eje Z
        Transform3D rotationX = new Transform3D();
        rotationX.rotX(-Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente
       
        Transform3D rotationY = new Transform3D();
        rotationY.rotY(Math.PI/-2.5);
        Transform3D rotationZ = new Transform3D();
        rotationZ.rotZ(-Math.PI/4.0);
        rotationX.mul(rotationY);
        rotationX.mul(rotationZ);

        // Trasladar el cubo a la posición deseada
        Vector3f translationVector = par1;
        Transform3D translation = new Transform3D();
        translation.setTranslation(translationVector);

        // Combinar las transformaciones de rotación y traslación
        translation.mul(rotationX);
        giro.setTransform(translation);
        
        return giro;
}
     private TransformGroup CraearPardeLimite2() {
          // Crear el grupo de transformación
        TransformGroup giro = new TransformGroup();
        // Crear el cubo
        Box box = new Box(0.01f, 0.05f, 0.35f, Box.GENERATE_NORMALS, app(1));

        // Agregar el cubo al grupo de transformación
        giro.addChild(box);

        // Rotar el cubo alrededor del eje X y del eje Z
        Transform3D rotationX = new Transform3D();
        rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente
       
        Transform3D rotationY = new Transform3D();
        rotationY.rotY(-0.654);
        Transform3D rotationZ = new Transform3D();
        rotationZ.rotZ(-Math.PI/4.0);
        rotationX.mul(rotationY);
        rotationX.mul(rotationZ);

        // Trasladar el cubo a la posición deseada
        Vector3f translationVector =par2;
        Transform3D translation = new Transform3D();
        translation.setTranslation(translationVector);

        // Combinar las transformaciones de rotación y traslación
        translation.mul(rotationX);
        giro.setTransform(translation);
        
        return giro;
}
    private TransformGroup CraearPardeLimite3() {
              // Crear el grupo de transformación
        TransformGroup giro = new TransformGroup();
        // Crear el cubo
        Box box = new Box(0.01f, 0.05f, 0.3f, Box.GENERATE_NORMALS, app(1));

        // Agregar el cubo al grupo de transformación
        giro.addChild(box);

        // Rotar el cubo alrededor del eje X y del eje Z
        Transform3D rotationX = new Transform3D();
        rotationX.rotX(-Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente
       
        Transform3D rotationY = new Transform3D();
        rotationY.rotY(Math.PI/-5.5);
        Transform3D rotationZ = new Transform3D();
        rotationZ.rotZ(-Math.PI/4);
        rotationX.mul(rotationY);
        rotationX.mul(rotationZ);

        // Trasladar el cubo a la posición deseada 
        Vector3f translationVector = par3;
        Transform3D translation = new Transform3D();
        translation.setTranslation(translationVector);

        // Combinar las transformaciones de rotación y traslación
        translation.mul(rotationX);
        giro.setTransform(translation);
        
        return giro;
}
     private TransformGroup CraearPardeLimite4() {
         // Crear el grupo de transformación
        TransformGroup giro = new TransformGroup();
        // Crear el cubo
        Box box = new Box(0.01f, 0.05f, 0.17f, Box.GENERATE_NORMALS, app(1));

        // Agregar el cubo al grupo de transformación
        giro.addChild(box);

         // Rotar el cubo alrededor del eje X y del eje Z
        Transform3D rotationX = new Transform3D();
        rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente
       
        Transform3D rotationY = new Transform3D();
        rotationY.rotY(Math.toRadians(108));
        Transform3D rotationZ = new Transform3D();
        rotationZ.rotZ(-Math.PI/4.0);
        rotationX.mul(rotationY);
        rotationX.mul(rotationZ);
        
        // Trasladar el cubo a la posición deseada
        Vector3f translationVector =par4; 
        Transform3D translation = new Transform3D();
        translation.setTranslation(translationVector);

        // Combinar las transformaciones de rotación y traslación
        translation.mul(rotationX);
        giro.setTransform(translation);
        
        return giro;
}
     private TransformGroup CraearPardeLimite5() {
                // Crear el grupo de transformación
        TransformGroup giro = new TransformGroup();
        // Crear el cubo
        Box box = new Box(0.01f, 0.05f, 0.13f, Box.GENERATE_NORMALS, app(1));

        // Agregar el cubo al grupo de transformación
        giro.addChild(box);

         // Rotar el cubo alrededor del eje X y del eje Z
        Transform3D rotationX = new Transform3D();
        rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente
       
        Transform3D rotationY = new Transform3D();
        rotationY.rotY(Math.toRadians(108));
        Transform3D rotationZ = new Transform3D();
        rotationZ.rotZ(-Math.PI/4.0);
        rotationX.mul(rotationY);
        rotationX.mul(rotationZ);
        
        // Trasladar el cubo a la posición deseada
        Vector3f translationVector =par5; 
        Transform3D translation = new Transform3D();
        translation.setTranslation(translationVector);

        // Combinar las transformaciones de rotación y traslación
        translation.mul(rotationX);
        giro.setTransform(translation);
        
        return giro;
}
     
      private TransformGroup CraearPardeLimite6() {
                 // Crear el grupo de transformación
        TransformGroup giro = new TransformGroup();
        // Crear el cubo
        Box box = new Box(0.01f, 0.05f, 0.39f, Box.GENERATE_NORMALS, app(1));

        // Agregar el cubo al grupo de transformación
        giro.addChild(box);

         // Rotar el cubo alrededor del eje X y del eje Z
        Transform3D rotationX = new Transform3D();
        rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente
       
        Transform3D rotationY = new Transform3D();
        rotationY.rotY(Math.toRadians(0));
        Transform3D rotationZ = new Transform3D();
        rotationZ.rotZ(-Math.PI/4.0);
        rotationX.mul(rotationY);
        rotationX.mul(rotationZ);
        
        // Trasladar el cubo a la posición deseada
        Vector3f translationVector =par6; 
        Transform3D translation = new Transform3D();
        translation.setTranslation(translationVector);

        // Combinar las transformaciones de rotación y traslación
        translation.mul(rotationX);
        giro.setTransform(translation);
        
        return giro;
}
      
       private TransformGroup CraearPardeInterna1() {
            // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.07f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna1;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
        private TransformGroup CraearPardeInterna2() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.06f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna2;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
        private TransformGroup CraearPardeInterna3() {
                     // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.09f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =interna3;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
         private TransformGroup CraearPardeInterna4() {
               // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.1f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna4;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna5() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.09f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna5;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna6() {
                   // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.09f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna6;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna7() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.12f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna7;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
           private TransformGroup CraearPardeInterna71() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.04f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna71;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
           private TransformGroup CraearPardeInterna8() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.009f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna8;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
           private TransformGroup CraearPardeInterna9() {
               // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.12f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna9;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
            private TransformGroup CraearPardeInterna10() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.18f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna10;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
        private TransformGroup CraearPardeInterna11() {
               // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.01f, 0.08f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna11;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}   
        
        private TransformGroup CraearPardeInterna12() {
                // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.04f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna12;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
         private TransformGroup CraearPardeInterna13() {
                   // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna13;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna14() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna14;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
     private TransformGroup CraearPardeInterna15() {
                   // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.01f, 0.2f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna15;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
         private TransformGroup CraearPardeInterna16() {
                // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.04f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna16;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna17() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.045f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna17;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna18() {
               // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.02f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna18;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
          private TransformGroup CraearPardeInterna19() {
                   // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.01f, 0.22f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna19;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
           private TransformGroup CraearPardeInterna20() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.18f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna20;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
            private TransformGroup CraearPardeInterna21() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.045f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna21;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna22() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna22;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna23() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.045f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna23;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna23i2() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.135f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna23i2;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
              private TransformGroup CraearPardeInterna22i2() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.12f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna22i2;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
              private TransformGroup CraearPardeInterna23i4() {
                  // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna23i4;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
               private TransformGroup CraearPardeInterna24() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.045f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =interna24;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
               private TransformGroup CraearPardeInterna25() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna25;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
            private TransformGroup CraearPardeInterna26() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.018f, 0.08f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(55));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna26;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
            private TransformGroup CraearPardeInterna27() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.018f, 0.067f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(115));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna27;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna28() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.018f, 0.067f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(115));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna28;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna29() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna29;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna30() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.04f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna30;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna31() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.008f, 0.03f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna31;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
            private TransformGroup CraearPardeInterna33() {
                   // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.01f, 0.21f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna33;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna34() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.02f, 0.03f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =interna34;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna35() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.006f, 0.03f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna35;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
            private TransformGroup CraearPardeInterna36() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.006f, 0.025f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna36;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna37() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.006f, 0.05f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =interna37;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna38() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.006f, 0.03f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector = interna38;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
             private TransformGroup CraearPardeInterna39() {
                    // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.005f, 0.015f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(90));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =  interna39;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
              private TransformGroup CraearPardeInterna40() {
                 // Crear el grupo de transformación
            TransformGroup giro = new TransformGroup();
            // Crear el cubo
            Box box = new Box(0.005f, 0.006f, 0.15f, Box.GENERATE_NORMALS, app(1));
            // Agregar el cubo al grupo de transformación
            giro.addChild(box);
            // Rotar el cubo alrededor del eje X y del eje Z
              // Rotar el cubo alrededor del eje X y del eje Z
            Transform3D rotationX = new Transform3D();
            rotationX.rotX(Math.PI/2.0); // Incrementar el ángulo en X para inclinar el cubo más verticalmente

            Transform3D rotationY = new Transform3D();
            rotationY.rotY(Math.toRadians(0));
            Transform3D rotationZ = new Transform3D();
            rotationZ.rotZ(-Math.PI/4.0);
            rotationX.mul(rotationY);
            rotationX.mul(rotationZ);
            // Trasladar el cubo a la posición deseada
            Vector3f translationVector =interna40;
            Transform3D translation = new Transform3D();
            translation.setTranslation(translationVector);
            // Combinar las transformaciones de rotación y traslación
            translation.mul(rotationX);
            giro.setTransform(translation);        
            return giro;
}
              public Appearance tomarTextura(int i){
          
       // TextureAttributes atributosTextura = new TextureAttributes();
       // atributosTextura.setTextureMode(TextureAttributes.REPLACE);
  
          //Texture textura = texturas[i].getTexture();
         // System.out.println(textura.getEnable());
          
          Material material = new Material();
      material.setAmbientColor(new Color3f(Color.DARK_GRAY));
      material.setDiffuseColor(new Color3f(Color.GREEN));
      material.setSpecularColor(new Color3f(Color.WHITE));
      material.setEmissiveColor(new Color3f(Color.BLACK));
      material.setShininess(20.0f);
      
        
        /*Para dar apariencia*/
        Appearance apariencia = new Appearance();
        //apariencia.setTexture(textura);
        apariencia.setMaterial(material);
        //apariencia.setTextureAttributes(atributosTextura);
        
        return apariencia;
    } 
                
     Appearance app(int i){
      Appearance apariencia=new Appearance();
      TexCoordGeneration texCoord=new TexCoordGeneration(
              TexCoordGeneration.OBJECT_LINEAR,TexCoordGeneration.TEXTURE_COORDINATE_2
      );
      apariencia.setTexCoordGeneration(texCoord);
      if (i==0){
       Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\laberinto\\pastito.jpg";}
      if(i==1){
      Ruta="C:\\Users\\mar45\\Documents\\NetBeansProjects\\Laberinto\\src\\laberinto\\tex2.jpg";
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
    public static void main(String[] args) {
        Frame frame = new MainFrame(new Laberinto(), 1600, 790); //Tamaño ventana de 256x256 pixeles.
    }

   
}

    
