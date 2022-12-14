package subjects;

import abstracts.CelestialBody;
import abstracts.Location;

public class Road extends Location {
    private int length;
    public Road(String name, CelestialBody celestialBody, int length) {
        super(name, celestialBody);
        this.length = length;
    }

    @Override
    public String getLocationName() {
        return super.getLocationName();
    }

    @Override
    public int hashCode() {
        int result = this.getLocationName() == null ? 0 : this.getLocationName().hashCode();
        return (result) * 41;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Road) obj).getLocationName().equals(this.getLocationName());
    }

    @Override
    public String toString() {
        return "Road: " + this.getLocationName();
    }
}
