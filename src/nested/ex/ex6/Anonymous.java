package nested.ex.ex6;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        void run() {
            System.out.println("자전거가 달립니다.");
        }
    };

    void method1() {
        Vehicle vehicle = new Vehicle(){
            @Override
            void run() {
                System.out.println("승용차가 달립니다.");
            }
        };
        vehicle.run();
    }

    void method2(String input) {
        Vehicle vehicle = new Vehicle() {
            @Override
            void run() {
                System.out.println(input);
            }
        };
        vehicle.run();
    }
}
