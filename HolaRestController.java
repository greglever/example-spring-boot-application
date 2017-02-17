@RestController 
@RequestMapping("/api")
public class HolaRestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/hola", produces = "text/plain")
	public String hola() throws UnknownHostException { String hostname = null;
		try {
		    hostname = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) { 
			hostname = "unknown";
			}	
			return "Hola Spring Boot de " + hostname; 
		}
	}
