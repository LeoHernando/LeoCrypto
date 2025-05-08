package com.leo.modal;

import com.leo.domain.VerificationType;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;
}
