package com.heliok.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.heliok.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}
