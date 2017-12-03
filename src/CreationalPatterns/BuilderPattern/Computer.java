package CreationalPatterns.BuilderPattern;

public class Computer {

    private String ram;

    private String hdd;

    private boolean isRamEnabled;

    private boolean isHDDEnabled;

    public Computer(ComputerBuilder computerBuilder){
        ram = computerBuilder.ram;
        hdd = computerBuilder.hdd;
        isRamEnabled = computerBuilder.isRamEnabled;
        isHDDEnabled = computerBuilder.isHDDEnabled;
    }

    public String toString(){
        return "RAM : " + ram + " HDD : " + hdd;
    }

    public static class ComputerBuilder{

        private String ram;

        private String hdd;

        private boolean isRamEnabled;

        private boolean isHDDEnabled;

        public ComputerBuilder(String ram, String hdd){
            this.ram = ram;
            this.hdd = hdd;
        }

        public ComputerBuilder setRamEnabled(boolean isRamEnabled){
            this.isRamEnabled = isRamEnabled;
            return this;
        }

        public ComputerBuilder setHDDEnabled(boolean isHDDEnabled){
            this.isHDDEnabled = isHDDEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
