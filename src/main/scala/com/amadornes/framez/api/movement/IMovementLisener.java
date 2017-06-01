/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amadornes.framez.api.movement;

import com.amadornes.trajectory.api.IMovingStructure;

/**
 *
 * @author coolestbean
 */
public interface IMovementLisener {
    
    public void onFinishMoving(IMovingStructure structure);
    
    public void onStartMoving();
    
}
