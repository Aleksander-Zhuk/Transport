package Transports.GroundTransports;

import Transports.*;

class GroundTransports extends Transport {
}
class RailwayTransports extends GroundTransports {
    class Locomotive extends RailwayTransports implements PublicUseTransports, CargoTransportation {

    }
    class Tramway extends RailwayTransports implements PublicUseTransports{

    }
    class Metropolitan extends RailwayTransports implements PublicUseTransports{

    }
}

class AvtomobileTransports  extends GroundTransports {
    class Truck extends AvtomobileTransports implements SpecialUseTransports, CargoTransportation {
    }
    class Cars extends AvtomobileTransports implements SpecialUseTransports, IndividualUseTransports{

    }
    class Bus extends AvtomobileTransports implements PublicUseTransports, IndividualUseTransports{

    }

}
class BikeTransports extends GroundTransports implements IndividualUseTransports, JustForEntertainment{

}