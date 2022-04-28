package tourGuide.attraction;

import gpsUtil.location.Attraction;

public class Proximate implements Comparable<Proximate> {
        Attraction attraction;
        Float distance;

    @Override
    public int compareTo(Proximate o) {
        return distance.compareTo(o.distance);
    }
    //compareTo<Proximate> (Proximate o) {


    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
