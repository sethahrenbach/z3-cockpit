package edu.missouri.z3cockpit.Controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import edu.missouri.z3cockpit.Models.Configuration;

import java.io.File;

@Controller
@RequestMapping(value = "/z3")
public class Z3Controller {

    @GetMapping("/greeting")
//    @ResponseBody
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting2";
    }
//
    @PostMapping("/checkUnsat")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity checkUnsat(@RequestBody Configuration configuration){
        File smt2 = configuration.getSMT2();
        return ResponseEntity.status(HttpStatus.OK).build();
    }


/// /    public static void main(String[] args) throws Exception {
//        try {
//            String pathToFile = "C:\\Users\\Seth\\Documents\\GitHub\\z3-cockpit\\out\\production\\resources\\static\\";
//            String smtFile = args[0];
//            String outFile = smtFile.split("\\.")[0];
//            ProcessBuilder pb = new ProcessBuilder("z3", pathToFile + smtFile);
//            final Process p = pb.start();
//            BufferedReader br = new BufferedReader(
//                    new InputStreamReader(p.getInputStream())
//            );
//            BufferedWriter bw = new BufferedWriter(
//                    new FileWriter(new File("../" + outFile + ".out"))
//            );
//            String line;
//            while((line = br.readLine())!=null) {
//                bw.write(line);
//            }
//            bw.close();
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//        System.out.println("Successful");
//    }
}
