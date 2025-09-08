public class lab_task_25aug {
    static class Appliance {
        protected int applianceId;
        protected String brand;

        public Appliance(int i, String b) {
            applianceId = i;
            brand = b;
        }

        public int calculatePowerConsumption() {
            return 0;
        }
    }

    //WashingMachine
    static class WashingMachine extends Appliance {
        private int powerPerCycle;
        private int cyclesUsed;

        public WashingMachine(int i, String b, int powerPerCycle, int cyclesUsed) {
            super(i, b);
            this.powerPerCycle = powerPerCycle;
            this.cyclesUsed = cyclesUsed;
        }

       
        public int calculatePowerConsumption() {
            return powerPerCycle * cyclesUsed;
        }

        public double calculatePowerConsumption(double reductionPercentage) {
            int original = powerPerCycle * cyclesUsed;
            return original - (original * reductionPercentage / 100);
        }
    }

    //WashingMachine
    static class Refrigerator extends Appliance {
        private int powerPerDay;
        private int daysUsed;

        public Refrigerator(int i, String b, int powerPerDay, int daysUsed) {
            super(i, b);
            this.powerPerDay = powerPerDay;
            this.daysUsed = daysUsed;
        }

       
        public int calculatePowerConsumption() {
            return powerPerDay * daysUsed;
        }

        // Overloaded method with reduction percentage
        public double calculatePowerConsumption(double reductionPercentage) {
            int original = powerPerDay * daysUsed;
            return original - (original * reductionPercentage / 100);
        }
    }

    public static void main(String[] args) {
        WashingMachine m1 = new WashingMachine(1000, "abc" , 10, 12 );
    }


}
