package com.syntexpro.bytecraft9.enumerateddatatype;

import java.util.EnumSet;

public class EnumSetExample1 {

    enum Cloud {
        AWS, AZURE, GCP, IBM, ALIBABA, ORACLE, SALESFORCE, PUBLIC, PRIVATE, HYBRID, COMMUNITY, IAAS, PAAS, SAAS
    }

    public static void main(String[] args) {

        EnumSet<Cloud> cloudServiceProviders = EnumSet.range(Cloud.AWS, Cloud.SALESFORCE);
        System.out.println("Cloud Service Providers: " + cloudServiceProviders);

        EnumSet<Cloud> cloudDeploymentModels = EnumSet.range(Cloud.PUBLIC, Cloud.COMMUNITY);
        System.out.println("Cloud Deployment Models: " + cloudDeploymentModels);

        EnumSet<Cloud> cloudServices = EnumSet.range(Cloud.IAAS, Cloud.SAAS);
        System.out.println("Cloud Services: " + cloudServices);
    }
}
