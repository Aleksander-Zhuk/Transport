package Transports.WaterTransports;
import Transports.Transport;

class WaterTransport extends Transport {
}
class RiverTransports extends WaterTransport{
    class Ferries extends RiverTransports {

    }
    class Barge extends RiverTransports {

    }
    class RiverTrams extends RiverTransports {

    }
    class Hovercraft extends RiverTransports {

    }

}
class SeaTransports extends WaterTransport {
    class CruiseShips extends SeaTransports {

    }
    class Tankers extends SeaTransports {

    }
    class ContainerShips extends SeaTransports {

    }
    class Dry_CargoShip extends SeaTransports {

    }

}
