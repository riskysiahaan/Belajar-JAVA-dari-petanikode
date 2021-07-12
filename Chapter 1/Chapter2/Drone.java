package Chapter2;

public class Drone {
    //atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;

    //method
    void terbang(){
        energi--;
        if(energi > 10){
            // terbang berarti nilai ketinggian berambah
            ketinggian++;
            System.out.println("Drone terbang...");
        }else{
            System.out.println("Energi lemah: Drone gak bisa terbang");
        }
    }

    void matikanMesin(){
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan");
        }else{
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun(){
        //ketinggian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok(){
        energi--;
        System.out.println("Drone belok");
    }

    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan--;
    }

}
