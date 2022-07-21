package AprendendoLambdas;

import java.util.*;
import java.util.function.Consumer;

import Foreach.TesteForEach;

import java.lang.*;

public class Teste {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("michelli", true, "123");
		Cliente c2 = new Cliente("bruno", true, "456");
		c1.autenticaSenha("123");
		
		List<Cliente> clientes = Arrays.asList(c1, c2);
		
		clientes.forEach(c -> System.out.println(c.getNome()));
		
		
		
		}
	}	
	
