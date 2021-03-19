# ApplicationExceptions

Exception Library, that extends the Error.

# Why we need this ?

When we have a large code base, we may invoke several methods for a single operation. The failure of any method might be catch using catch block. Since most the developers will generically catch the Exception instead of specific one like NullPointerException. This will lead to have a correpted transaction. To avoid, we need to throw the Error instead of Exception.

For Example, when we invoke method1 and method1 do the 2 operations in method2 and method3. Then any exception in method2 will be catched and method3 will not aware of that. So this leads to have a correpted transaction/operations.

method1()
{
   method2();
   method3();
}

method2()
{
   try
   {
      // Some DB operations
   }
   catch(Exception ex)
   {
   }
}

method3()
{
   try
   {
      // Some DB operations
   }
   catch(Exception ex)
   {
   }
}

