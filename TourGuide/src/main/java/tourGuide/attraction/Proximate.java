package tourGuide.attraction;

import gpsUtil.location.Attraction;

public class Proximate implements Comparable<Proximate> {
        Attraction attraction;
        Float distance;


        compareTo<Proximate> (Proximate o) {
            return distance.compareTo(o.distance);
        }
    }
