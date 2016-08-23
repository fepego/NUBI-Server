package com.nubi.controlador;

import com.nubi.controlador.Sitio;
import com.nubi.controlador.message;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Felipe on 18/08/2016.
 */
public class test {
    public static message msj;
    public static List<Sitio> st;
    public static void main(String[] args) {
        try {
            // load up the knowledge base
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
//            msj = new message();
//            msj.setMessage("Hello World");
//            msj.setStatus(message.HELLO);
            st= new ArrayList<Sitio>();
            st.add(new Sitio());
            st.get(0).setDisponibilidad((float)0.3);
            st.get(0).setToleranciaRuido("Bajo");
            for (Sitio s: st)
            {
                kSession.insert(s);
                kSession.fireAllRules();
            }


        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}
