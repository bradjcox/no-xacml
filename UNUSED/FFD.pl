/**
 * This policy governs access to the 5th Fleet CAS Portal Home Page.
 * It allows all Fleet Commanders, Fleet Operations Officers, Fleet
 * Intell Officers, and Fleet Senior Enlisted Operations Specialists
 * (2-7).  It also allows access for CSG Operations Officers, CSG Intel
 * Officers, and CSG Senior Operations Specialists from each of the 2
 * CSG groups.  This policy also defines a rule that allows access to
 * the Officer or Enlisted Training List based on pay grade.  More
 * description will come as policy is created.</Description>
*/
policy com.technica.pbac.demo.poc.FifthFleetPolicy
{
  when
  {
    resource.resourceId == ".*Fleet.*";
  }
  then firstApplicable
  {
    rule ViewPlans
    {
      when resource.resourceId == ".*Plans.*" 
      permit if subject.CountryOfCitizenship.oneAndOnly() == "US"
        && subject.OrganizationID.oneAndOnly().isIn(bag("USN", "USMC"))
        && subject.DutyOccupatonalCode.isIn(bag("2201", "2207"))
        && !(subject.PayGrade.isIn(bag("E1", "E2", "E3", "E4", "E5", "E6")))
        && subject.PersonnelCategoryCode.isIn(bag("A", "C"))
        && ( "Country Yellow".isIn(subject.GeographicSubRegion)
          || "Fifth Fleet".isIn(subject.GeographicSubRegion)
        )
        && ( "CTF 153".isIn(subject.ExtendedGroup)
          || "Fifth Fleet".isIn(subject.ExtendedGroup)
          || "Second Fleet".isIn(subject.ExtendedGroup)
          || "Third Fleet".isIn(subject.ExtendedGroup)
          || "Fourth Fleet".isIn(subject.ExtendedGroup)
          || "Sixth Fleet".isIn(subject.ExtendedGroup)
          || "Seventh Fleet".isIn(subject.ExtendedGroup)
          || "CSG1".isIn(subject.ExtendedGroup)
          || "CSG2".isIn(subject.ExtendedGroup)
        );
    }
    rule DenyPlans
    {
    }
  }
}
