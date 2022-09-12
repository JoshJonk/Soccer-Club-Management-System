/*
Author: Trevor Ngcobo (220477019)
Subject: Applications Development Practice 3
Group: 18
Assessment: Capstone Project 2022
*/

package za.ac.cput.service.entity;

import za.ac.cput.domain.entity.Manager;
import za.ac.cput.domain.entity.Player;
import za.ac.cput.service.IService;

import java.util.List;

public interface ManagerServiceInterface extends IService<Manager, String>
{
    public List<Manager> readAll();
    public void deleteById(String id);
}
