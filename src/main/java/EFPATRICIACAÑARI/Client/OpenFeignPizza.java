package EFPATRICIACA�ARI.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import EFPATRICIACA�ARI.DTO.Pizza;

@FeignClient(name = "idat-pizza", url="localhost:8090")
public interface OpenFeignPizza {
	
	@GetMapping("/pizza/v1/listar")
	public List<Pizza> listarPizzasSeleccionados();

}
