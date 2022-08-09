package za.ac.cput.factory.contract;


import za.ac.cput.domain.contract.Contract;
import za.ac.cput.domain.contract.ManagerContract;
import za.ac.cput.util.Helper;

public class ManagerContractFactory {
    public static ManagerContract createManagerContract(String contractId, String milestonesOnTime, int numberOfGrievances, Contract contract){

        if(Helper.isEmptyOrNull(contractId)||Helper.isEmptyOrNull(milestonesOnTime)) return null;

        return new ManagerContract.ManagerContractBuilder()
                .setClubID(contractId)
                .setClubName(milestonesOnTime)
                .setClubOwner(numberOfGrievance)
                .setRegisteredClub(isRegisteredClub)
                .build();
    }
}
