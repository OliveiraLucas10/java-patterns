package com.oliveiralucas.java;

import java.util.function.Supplier;

public class SingletonTester
{
  public static boolean isSingleton(Supplier<Object> func)
  {
    return func.get() == func.get();
  }
}