package Transports.WaterTransports;
import Transports.CargoTransportation;
import Transports.PublicUseTransports;
import Transports.Transport;

class WaterTransport extends Transport {
}
class RiverTransports extends WaterTransport{
    class Ferries extends RiverTransports implements PublicUseTransports, CargoTransportation{

    }
    class Barge extends RiverTransports implements CargoTransportation{

    }
    class RiverTrams extends RiverTransports implements PublicUseTransports{

    }
    class Hovercraft extends RiverTransports implements PublicUseTransports, CargoTransportation{

    }

}
class SeaTransports extends WaterTransport {
    class CruiseShips extends SeaTransports implements PublicUseTransports {

    }
    class Tankers extends SeaTransports implements CargoTransportation {

    }
    class ContainerShips extends SeaTransports implements CargoTransportation{

    }
    class Dry_CargoShip extends SeaTransports implements CargoTransportation {

    }

}
