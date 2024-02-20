package com.example.Inventoryservice.service;

import com.example.Inventoryservice.repository.InventoryRepository;
//import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

@Service
@RequiredArgsConstructor
public class InventoryService {
    private final InventoryRepository inventoryRepository;
    @Transactional(readOnly=true)
    public boolean isInstock(String Skucode)
    {
    return inventoryRepository.findByskuCode(Skucode).isPresent();
    }
}
