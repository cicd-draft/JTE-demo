/*
  specify which libraries to load:
    In the Governance Tier configuration file,
    these should be configurations common across
    all apps governed by this config.

*/
application_environments{
  dev{
    short_name = "dev"
    long_name = "Development"
    hosts = "dev.MyCompany.com"
  }

  qa{
    short_name = "qa"
    long_name = "QA"
    hosts = "qa.MyCompany.com"
  }

  uat{
    short_name = "uat"
    long_name = "UAT"
    hosts = "uat.MyCompany.com"
  }
  
  prod{
    short_name = "prod"
    long_name = "Production"
    hosts = "prod.MyCompany.com"
  }
}

libraries{
  merge = true
  slack
}