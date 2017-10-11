package by.tc.task01.entity;

public class TabletPC extends Appliance{

    private int batteryCapacity;

    private int displayInches;

    private int memoryRom;

    private int flashMemoryCapacity;

    private String color;

    @Override
    public String getAllParameters() {

        return "TablePC : BATTERY_CAPACITY = " + batteryCapacity +
                ", DISPLAY_INCHES = " + displayInches +
                ", MEMORY_ROM = " + memoryRom +
                ", FLASH_MEMORY_CAPACITY = " + flashMemoryCapacity +
                ", COLOR = " + color + ";";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        TabletPC tabletPC = (TabletPC) o;

        if (batteryCapacity != tabletPC.batteryCapacity) {
            return false;
        }
        if (displayInches != tabletPC.displayInches) {
            return false;
        }
            if (memoryRom != tabletPC.memoryRom) {
            return false;
            }
        if (flashMemoryCapacity != tabletPC.flashMemoryCapacity) {
            return false;
        }
        return color != null ? color.equals(tabletPC.color) : tabletPC.color == null;
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity;
        result = 31 * result + displayInches;
        result = 31 * result + memoryRom;
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
