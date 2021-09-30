package stepsPO;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
    @Before
    public void iniciar(){
                System.out.println("0 - Antes do teste iniciar");

    }

    @After
    public void finalizar(){
       System.out.println("Z - Depois de finalizar o teste");

    }
}
