package Transports.AirTransports;

import Transports.JustForEntertainment;
import Transports.PublicUseTransports;
import Transports.SpecialUseTransports;
import Transports.Transport;

class AirTransports extends Transport {
}
class AviationTransports extends AirTransports {
    class HilitaryAviation extends AirTransports implements SpecialUseTransports {

    }
    class CivilAviation extends AirTransports implements PublicUseTransports {

    }
    class PoliceAviation extends AirTransports implements SpecialUseTransports {

    }
    class AirAmbulance extends AirTransports implements SpecialUseTransports {

    }

}
class AeronauticsTransports extends AirTransports {
    class Balloon extends AeronauticsTransports implements JustForEntertainment {

    }
    class Airship extends AeronauticsTransports implements PublicUseTransports {

    }
    class Glider extends AeronauticsTransports implements JustForEntertainment{

    }

}
