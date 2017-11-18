package Lab8_.Tarea_Lab8;

import static guru.nidi.graphviz.model.Factory.graph;
import static guru.nidi.graphviz.model.Factory.node;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.model.Graph;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.parse.Parser;

public class DemoGraphviz {	
	
	public void createDemoFromDot(String ruta) throws IOException {            
            File file = new File(ruta);            
            FileInputStream fis = null;		
            fis = new FileInputStream(file);		
            MutableGraph g = Parser.read(fis);
            Graphviz.fromGraph(g).width(700).render(Format.PNG).toFile(new File("example/Carlos_Cuellar_2497117"));
        }
}