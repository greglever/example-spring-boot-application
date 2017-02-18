@RestController
class ExampleRootEndpoint {

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }

}
