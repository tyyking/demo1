/**
 * About:
 * Other:
 * Created: tyy on 12:17 2018/9/11
 * Editored:
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/index/{name}")
    @ResponseBody
    public String index(@PathVariable String name){

        if(null==name){
            name="boy";
        }

        return "hello world" +name;
    }


}
