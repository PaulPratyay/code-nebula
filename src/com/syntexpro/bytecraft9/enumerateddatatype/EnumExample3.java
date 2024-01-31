package com.syntexpro.bytecraft9.enumerateddatatype;

public class EnumExample3 {

    enum CloudDeploymentModels {
        PUBLIC, PRIVATE, HYBRID, COMMUNITY
    }

    enum CloudServices {
        IAAS, PAAS, SAAS
    }

    public static void main(String[] args) {

        System.out.println("There are four cloud deployment models:");
        for (CloudDeploymentModels cloudDeploymentModels : CloudDeploymentModels.values()) {
            System.out.println(cloudDeploymentModels);
        }

        System.out.println();

        System.out.println("There are three main cloud services: ");
        for (CloudServices cloudServices : CloudServices.values()) {
            System.out.println(cloudServices);
        }

        System.out.println();
        System.out.println(CloudServices.IAAS + " = Infrastructure as a Service");
        System.out.println(CloudServices.PAAS + " = Platform as a Service");
        System.out.println(CloudServices.SAAS + " = Software as a Service");

    }
}
