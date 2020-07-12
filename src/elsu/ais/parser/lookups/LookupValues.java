package elsu.ais.parser.lookups;

import java.util.HashMap;

public class LookupValues {

	private static HashMap<Integer, String> navigationStatus = new HashMap<Integer, String>() {
		{
			put(0, "Under way using engine");
			put(1, "At anchor");
			put(2, "Not under command");
			put(3, "Restricted manoeuverability");
			put(4, "Constrained by her draught");
			put(5, "Moored");
			put(6, "Aground");
			put(7, "Engaged in Fishing");
			put(8, "Under way sailing");
			put(9, "Reserved for future amendment of Navigational Status for HSC");
			put(10, "Reserved for future amendment of Navigational Status for WIG");
			put(11, "Reserved for future use");
			put(12, "Reserved for future use");
			put(13, "Reserved for future use");
			put(14, "AIS-SART is active");
			put(15, "Not defined (default)");

		}
	};

	public static String getNavigationStatus(Integer status) {
		return navigationStatus.get(status);
	}

	private static HashMap<Integer, String> maneuverIndicator = new HashMap<Integer, String>() {
		{
			put(0, "Not available (default)");
			put(1, "No special maneuver");
			put(2, "Special maneuver (such as regional passing arrangement)");
		}
	};

	public static String getManeuverIndicator(Integer maneuver) {
		return maneuverIndicator.get(maneuver);
	}

	private static HashMap<Integer, String> EPFDFixTypes = new HashMap<Integer, String>() {
		{
			put(0, "Undefined (default)");
			put(1, "GPS");
			put(2, "GLONASS");
			put(3, "Combined GPS/GLONASS");
			put(4, "Loran-C");
			put(5, "Chayka");
			put(6, "Integrated navigation system");
			put(7, "Surveyed");
			put(8, "Galileo");
			put(15, "Undefined");
		}
	};

	public static String getEPFDFixType(Integer epfd) {
		return EPFDFixTypes.get(epfd);
	}

	private static HashMap<Integer, String> ShipTypes = new HashMap<Integer, String>() {
		{
			put(0, "Not available (default)");
			put(1, "Reserved for future use");
			put(2, "Reserved for future use");
			put(3, "Reserved for future use");
			put(4, "Reserved for future use");
			put(5, "Reserved for future use");
			put(6, "Reserved for future use");
			put(7, "Reserved for future use");
			put(8, "Reserved for future use");
			put(9, "Reserved for future use");
			put(10, "Reserved for future use");
			put(11, "Reserved for future use");
			put(12, "Reserved for future use");
			put(13, "Reserved for future use");
			put(14, "Reserved for future use");
			put(15, "Reserved for future use");
			put(16, "Reserved for future use");
			put(17, "Reserved for future use");
			put(18, "Reserved for future use");
			put(19, "Reserved for future use");
			put(20, "Wing in ground (WIG), all ships of this type");
			put(21, "Wing in ground (WIG), Hazardous category A");
			put(22, "Wing in ground (WIG), Hazardous category B");
			put(23, "Wing in ground (WIG), Hazardous category C");
			put(24, "Wing in ground (WIG), Hazardous category D");
			put(25, "Wing in ground (WIG), Reserved for future use");
			put(26, "Wing in ground (WIG), Reserved for future use");
			put(27, "Wing in ground (WIG), Reserved for future use");
			put(28, "Wing in ground (WIG), Reserved for future use");
			put(29, "Wing in ground (WIG), Reserved for future use");
			put(30, "Fishing");
			put(31, "Towing");
			put(32, "Towing: length exceeds 200m or breadth exceeds 25m");
			put(33, "Dredging or underwater ops");
			put(34, "Diving ops");
			put(35, "Military ops");
			put(36, "Sailing");
			put(37, "Pleasure Craft");
			put(38, "Reserved");
			put(39, "Reserved");
			put(40, "High speed craft (HSC), all ships of this type");
			put(41, "High speed craft (HSC), Hazardous category A");
			put(42, "High speed craft (HSC), Hazardous category B");
			put(43, "High speed craft (HSC), Hazardous category C");
			put(44, "High speed craft (HSC), Hazardous category D");
			put(45, "High speed craft (HSC), Reserved for future use");
			put(46, "High speed craft (HSC), Reserved for future use");
			put(47, "High speed craft (HSC), Reserved for future use");
			put(48, "High speed craft (HSC), Reserved for future use");
			put(49, "High speed craft (HSC), No additional information");
			put(50, "Pilot Vessel");
			put(51, "Search and Rescue vessel");
			put(52, "Tug");
			put(53, "Port Tender");
			put(54, "Anti-pollution equipment");
			put(55, "Law Enforcement");
			put(56, "Spare - Local Vessel");
			put(57, "Spare - Local Vessel");
			put(58, "Medical Transport");
			put(59, "Noncombatant ship according to RR Resolution No. 18");
			put(60, "Passenger, all ships of this type");
			put(61, "Passenger, Hazardous category A");
			put(62, "Passenger, Hazardous category B");
			put(63, "Passenger, Hazardous category C");
			put(64, "Passenger, Hazardous category D");
			put(65, "Passenger, Reserved for future use");
			put(66, "Passenger, Reserved for future use");
			put(67, "Passenger, Reserved for future use");
			put(68, "Passenger, Reserved for future use");
			put(69, "Passenger, No additional information");
			put(70, "Cargo, all ships of this type");
			put(71, "Cargo, Hazardous category A");
			put(72, "Cargo, Hazardous category B");
			put(73, "Cargo, Hazardous category C");
			put(74, "Cargo, Hazardous category D");
			put(75, "Cargo, Reserved for future use");
			put(76, "Cargo, Reserved for future use");
			put(77, "Cargo, Reserved for future use");
			put(78, "Cargo, Reserved for future use");
			put(79, "Cargo, No additional information");
			put(80, "Tanker, all ships of this type");
			put(81, "Tanker, Hazardous category A");
			put(82, "Tanker, Hazardous category B");
			put(83, "Tanker, Hazardous category C");
			put(84, "Tanker, Hazardous category D");
			put(85, "Tanker, Reserved for future use");
			put(86, "Tanker, Reserved for future use");
			put(87, "Tanker, Reserved for future use");
			put(88, "Tanker, Reserved for future use");
			put(89, "Tanker, No additional information");
			put(90, "Other Type, all ships of this type");
			put(91, "Other Type, Hazardous category A");
			put(92, "Other Type, Hazardous category B");
			put(93, "Other Type, Hazardous category C");
			put(94, "Other Type, Hazardous category D");
			put(95, "Other Type, Reserved for future use");
			put(96, "Other Type, Reserved for future use");
			put(97, "Other Type, Reserved for future use");
			put(98, "Other Type, Reserved for future use");
			put(99, "Other Type, no additional information");
		}
	};

	public static String getShipType(Integer shipType) {
		return ShipTypes.get(shipType);
	}

	private static HashMap<Integer, String> NavaidTypes = new HashMap<Integer, String>() {
		{
			put(0, "Default, Type of Aid to Navigation not specified");
			put(1, "Reference point");
			put(2, "RACON (radar transponder marking a navigation hazard)");
			put(3, "Fixed structure off shore, such as oil platforms, wind farms, rigs. (Note: This code should identify an obstruction that is fitted with an Aid-to-Navigation AIS station.)");
			put(4, "Spare, Reserved for future use.");
			put(5, "Light, without sectors");
			put(6, "Light, with sectors");
			put(7, "Leading Light Front");
			put(8, "Leading Light Rear");
			put(9, "Beacon, Cardinal N");
			put(10, "Beacon, Cardinal E");
			put(11, "Beacon, Cardinal S");
			put(12, "Beacon, Cardinal W");
			put(13, "Beacon, Port hand");
			put(14, "Beacon, Starboard hand");
			put(15, "Beacon, Preferred Channel port hand");
			put(16, "Beacon, Preferred Channel starboard hand");
			put(17, "Beacon, Isolated danger");
			put(18, "Beacon, Safe water");
			put(19, "Beacon, Special mark");
			put(20, "Cardinal Mark N");
			put(21, "Cardinal Mark E");
			put(22, "Cardinal Mark S");
			put(23, "Cardinal Mark W");
			put(24, "Port hand Mark");
			put(25, "Starboard hand Mark");
			put(26, "Preferred Channel Port hand");
			put(27, "Preferred Channel Starboard hand");
			put(28, "Isolated danger");
			put(29, "Safe Water");
			put(30, "Special Mark");
			put(31, "Light Vessel / LANBY / Rigs");
		}
	};

	public static String getNavAidType(Integer navaidType) {
		return NavaidTypes.get(navaidType);
	}
}