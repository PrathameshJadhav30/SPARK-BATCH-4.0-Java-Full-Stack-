package com.Prathamesh.ChatBot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class GemeniWebSocketHandler extends TextWebSocketHandler {

    private static final Logger logger = LoggerFactory.getLogger(GemeniWebSocketHandler.class);

    // Triggered when client connects
    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info("WebSocket Connected: " + session.getId());
        session.sendMessage(new TextMessage("Connected to Gemini Chat WebSocket ✔"));
    }

    // Triggered when text message received from client
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        String userMessage = message.getPayload();
        logger.info("Received message: {}", userMessage);

        // Dummy response – Replace with Gemini API later
        String botReply = "Gemeni Bot Response: You said → " + userMessage;

        // Send response back to frontend/WebSocket client
        session.sendMessage(new TextMessage(botReply));
    }

    // Triggered when user disconnects
    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.info("WebSocket Closed: " + session.getId() + " Status: " + status);
    }

    // Triggered when any WebSocket error happens
    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        logger.error("WebSocket Error for session " + session.getId(), exception);
        session.close(CloseStatus.SERVER_ERROR);
    }
}
