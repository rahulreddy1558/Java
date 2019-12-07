package CollectionsRevisit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Camera {
    String make;
    String model;


    Camera(String make, String model){
        this.make = make;
        this.model = model;
    }


    @Override
    public int hashCode(){
        return  1;
    }

    @Override
    public String toString(){
        return String.format("{Camera Make:%s , Camera Model:%s}",this.make,this.model);
    }

    @Override
    public boolean equals(Object o){
        if( !(o instanceof Camera)) return false;

        Camera camParam = (Camera) o;
        return this.model.equals(camParam.model) && this.make.equals(camParam.make);
    }


    public static void main(String[] args) {
        Camera cam1 = new Camera("Nikon","D900");
        Camera cam2 = new Camera("Nikon","D800");
        Camera cam3 = new Camera("Nikon","D900");

        System.out.println(cam1);
        System.out.println(cam2);

        List<Camera> camCollection = Arrays.asList(cam1,cam2);
        System.out.println(camCollection.contains(cam3));
    }

}
