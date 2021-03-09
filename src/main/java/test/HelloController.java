package test;

import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }

    @Get("/foo")
    public String foo() {
        return "foo";
    }
}