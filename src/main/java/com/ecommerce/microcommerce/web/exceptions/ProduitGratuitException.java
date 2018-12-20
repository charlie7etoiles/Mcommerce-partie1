package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ProduitGratuitException extends RuntimeException {
	public ProduitGratuitException(){
		super("Le prix de vente ne peut être nul. Un produit gratuit n'est pas autorisé.");
	}
}
