package org.Pratham.SpringBoot01;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{

    @Override
    public String getMessage() {
        return "Email: You Have Got New Message.....";
    }
}
