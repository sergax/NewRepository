package Task7;

public class MyFirstBuilder {
    public static void main(String[] args) {
        Equipment equipment = new Equipment.BuilderEquipment("Bugler").setColor("black").setMaxSpeed(500).buildEquipment();
        System.out.println(equipment.getName());
        System.out.println(equipment.getColor());
        System.out.println(equipment.getMaxSpeed());
    }
}

class Equipment {
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private Equipment(BuilderEquipment builderEquipment) {
        this.name = builderEquipment.name;
        this.color = builderEquipment.color = "red";
        this.maxSpeed = builderEquipment.maxSpeed = 1000;
    }

    static class BuilderEquipment {
        private String name;
        private String color;
        private int maxSpeed;

        public BuilderEquipment(String name) {
            this.name = name;
        }

        public BuilderEquipment setColor(String color) {
            this.color = color;
            return this;
        }

        public BuilderEquipment setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Equipment buildEquipment() {
            return new Equipment(this);
        }
    }
}
