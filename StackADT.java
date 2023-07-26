/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.individual.inventoryapp;

/**
 *
 * @author festus twum 10907596
 * @param <T>
 */
public interface StackADT<T> {
    
    public void push(T element);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public int size();

    public String toString();
}

