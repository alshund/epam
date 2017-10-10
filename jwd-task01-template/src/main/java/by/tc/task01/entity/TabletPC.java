package by.tc.task01.entity;

public class TabletPC extends Appliance{

    private int powerCapacity;

    private int displayInches;

    private int memoryRom;

    private int flashMemoryCapacity;

    private String color;

    @Override
    public String getAllParameters() {

        return "TablePC : POWER_CAPACITY = " + powerCapacity +
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

        if (powerCapacity != tabletPC.powerCapacity) {
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
        int result = powerCapacity;
        result = 31 * result + displayInches;
        result = 31 * result + memoryRom;
        result = 31 * result + flashMemoryCapacity;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    public int getPowerCapacity() {
        return powerCapacity;
    }

    public void setPowerCapacity(int powerCapacity) {
        this.powerCapacity = powerCapacity;
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
