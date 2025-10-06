# Power Outlet Adapter System

## Problem Statement
You are developing an application that helps users manage and control various electronic devices by plugging them into power outlets. Each device has different plug types, voltage, and amperage requirements. To ensure compatibility and safety, you need to create adapters for different devices to allow them to be plugged into standard power outlets.

## Design Pattern
**Adapter Design Pattern** - Converts the interface of a class into another interface clients expect.

## Project Structure

## UML Class Diagram
![UML Diagram](images/uml-diagram.png)

## Components

### Target Interface
- `PowerOutlet` - Standard interface with `plugIn()` method

### Adaptee Classes
- `Laptop` - Has `charge()` method
- `Refrigerator` - Has `startCooling()` method  
- `SmartphoneCharger` - Has `chargePhone()` method

### Adapter Classes
- `LaptopAdapter` - Adapts `Laptop` to `PowerOutlet`
- `RefrigeratorAdapter` - Adapts `Refrigerator` to `PowerOutlet`
- `SmartphoneAdapter` - Adapts `SmartphoneCharger` to `PowerOutlet`

## How to Run

### Prerequisites
- Java JDK 8 or higher
- Git

