package br.com.modelo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.acoes.BandaAcoes;
 
 
@Controller
public class BandaController {
 
    @Autowired
    private BandaAcoes bandaAcoes;

	public BandaAcoes getBandaAcoes() {
		return bandaAcoes;
	}

	public void setBandaAcoes(BandaAcoes bandaAcoes) {
		this.bandaAcoes = bandaAcoes;
	}
    
	@RequestMapping("/")
	public ModelAndView home() {
	    List<Banda> listBanda = bandaAcoes.listAll();
	    ModelAndView mav = new ModelAndView("index");
	    mav.addObject("listBanda", listBanda);
	    return mav;
	}
    
    
    
    
}