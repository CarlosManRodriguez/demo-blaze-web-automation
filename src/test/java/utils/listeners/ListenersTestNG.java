package utils.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

public class ListenersTestNG extends BaseTest implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Iniciando Test: " + context.getName());
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Iniciando metodo del test: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Exitoso: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Fallo: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skipped: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Finalizo test: " + context.getName());

    }
}
