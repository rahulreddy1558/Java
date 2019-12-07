package CollectionsRevisit;

public class StudentHash {
    String name;

    StudentHash(String name){
        this.name = name;
    }


    @Override
    public String toString() {
        return "StudentHash{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        return this.name.length();
    }






}
