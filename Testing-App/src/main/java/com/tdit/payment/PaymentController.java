package com.tdit.payment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {


    private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);

    //this is payment config class
    @PostMapping("/debit-card")
    public String makePaymentThroughDebitCard(@RequestParam int amount){
        //-----BUSINESS LOGIC----
        int price=999;
        logger.info("{}","info that payment is done");
        return (amount==price)?"Payment successfully":"Enter correct amount";
    }

}
