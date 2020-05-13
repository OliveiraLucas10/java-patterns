package com.oliveiralucas.java;

public interface Rectangle
{
    int getWidth();
    int getHeight();

    default int getArea()
    {
      return getWidth() * getHeight();
    }
  }