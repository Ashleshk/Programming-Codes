
package com.lti.resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lowagie.text.DocumentException;
import com.lti.dto.AmountDto;
import com.lti.dto.BuyAmountDetailsDto;
import com.lti.dto.CalculateDetailsDto;
import com.lti.dto.ClaimDto;
import com.lti.dto.ClaimsDto;
import com.lti.dto.ContactDto;
import com.lti.dto.DocumentsUploaded;

import com.lti.dto.OtpDto;

import com.lti.dto.PolicyDto;
import com.lti.dto.StatusDto;
import com.lti.dto.StatusDto.StatusType;
import com.lti.dto.UserDto;
import com.lti.dto.VehicleDetailsDto;
import com.lti.model.Admin;
import com.lti.model.Claim;
import com.lti.model.Parameter;
import com.lti.model.Plan;
import com.lti.model.Policy;
import com.lti.model.User;
import com.lti.model.Vehicle;
import com.lti.model.VehicleManufacturer;
import com.lti.model.VehicleModel;
import com.lti.service.AdminService;
import com.lti.service.PDFExporter;
import com.lti.service.PolicyService;
import com.lti.service.UserService;
import com.lti.service.VehicleService;

@RestController
@CrossOrigin
//@CrossOrigin(origins = "http://localhost:4200")
public class InsuranceResource {
	
	@Autowired
	PolicyService policyService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	AdminService adminService;
	
	@Autowired
	VehicleService vehicleService;
	
	@PostMapping("/Users")
	public StatusDto addUser( UserDto userDto) {
		User user = new User();
		user.setAddress(userDto.getAddress());
		user.setEmail(userDto.getEmail());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setName(userDto.getName());
		user.setPassword(userDto.getPassword());
		user.setPolicies(null);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		user.setDateOfBirth(LocalDate.parse(userDto.getDateOfBirth(),formatter));
		
		String docUploadLocation = "F:/project-(general insurance)/uploads/";
		String uploadedFileName = userDto.getAadhaar().getOriginalFilename();      /// update polcyDto
		String newFileName =userDto.getName()+"-"+ userDto.getDateOfBirth() + "-" + uploadedFileName;
        String targetFileName = docUploadLocation + newFileName;
		try {
			FileCopyUtils.copy(userDto.getAadhaar().getInputStream(), new FileOutputStream(targetFileName));
		} catch(IOException e) {
			e.printStackTrace(); //hoping no error would occur
			StatusDto status = new StatusDto();
			status.setStatus(StatusType.FAILED);
			status.setMessage("File upload failed!");
		}
		
		user.setAadhaar(newFileName);
		StatusDto statusDto = new StatusDto();
		
		try {
			user = userService.addorUpdateUser(user);
			statusDto.setStatus(StatusType.SUCCESS);
			statusDto.setMessage(Integer.toString(user.getUserId()));
		} catch (IllegalArgumentException e) {
			statusDto.setStatus(StatusType.EMAILUSED);
			statusDto.setMessage("Email already used");
			
		} catch(Exception e) {
			statusDto.setStatus(StatusType.FAILED);
			statusDto.setMessage(e.getMessage());
		}
		return statusDto;
	}
	
	
	//update profile
	
	@PutMapping("/updateUser/{userId}")
	public StatusDto updateUser( UserDto userDto,@PathVariable("userId") int userId) {
		User user = userService.findUserById(userId);
		
		user.setAddress(userDto.getAddress());
		user.setEmail(userDto.getEmail());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setName(userDto.getName());
	
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		user.setDateOfBirth(LocalDate.parse(userDto.getDateOfBirth(),formatter));
		
		String docUploadLocation = "F:/project-(general insurance)/uploads/";
		String uploadedFileName = userDto.getAadhaar().getOriginalFilename();      /// update polcyDto
		String newFileName =userDto.getName()+"-"+ userDto.getDateOfBirth() + "-" + uploadedFileName;
        String targetFileName = docUploadLocation + newFileName;
		try {
			FileCopyUtils.copy(userDto.getAadhaar().getInputStream(), new FileOutputStream(targetFileName));
		} catch(IOException e) {
			e.printStackTrace(); //hoping no error would occur
			StatusDto status = new StatusDto();
			status.setStatus(StatusType.FAILED);
			status.setMessage("File upload failed!");
		}
		
		user.setAadhaar(newFileName);
		StatusDto statusDto = new StatusDto();
		
		try {
			user = userService.addorUpdateUser(user);
			statusDto.setStatus(StatusType.SUCCESS);
			statusDto.setMessage(Integer.toString(user.getUserId()));
		} catch (IllegalArgumentException e) {
			statusDto.setStatus(StatusType.EMAILUSED);
			statusDto.setMessage("Email already used");
			
		} catch(Exception e) {
			statusDto.setStatus(StatusType.FAILED);
			statusDto.setMessage(e.getMessage());
		}
		return statusDto;
	}
	
	
	@PostMapping("/ClaimsByPolicy/{policyId}")

//	requestbody is removed to test the file upload
//	public Claim addClaimToPolicy(ClaimsDto claimsDto,@PathVariable("policyId") int policyId) {
//	public Claim addClaimToPolicy(@RequestBody ClaimsDto claimsDto,@PathVariable("policyId") int policyId) {

	public StatusDto addClaimToPolicy(ClaimsDto claimsDto,@PathVariable("policyId") int policyId) {

		Claim claim = new Claim();
		claim.setAmount(0);
		claim.setResponse("Unchecked");
		claim.setReason(claimsDto.getReason());
		
		String docUploadLocation = "F:/project-(general insurance)/uploads/";
		String uploadedFileName = claimsDto.getLicense().getOriginalFilename();     
		String newFileName = policyId + "-" + uploadedFileName;
        String targetFileName = docUploadLocation + newFileName;
		try {
			FileCopyUtils.copy(claimsDto.getLicense().getInputStream(), new FileOutputStream(targetFileName));
		} catch(IOException e) {
			e.printStackTrace(); //hoping no error would occur
			StatusDto status = new StatusDto();
			status.setStatus(StatusType.FAILED);
			status.setMessage("File upload failed!");
		}
		claim.setLicense(newFileName);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		claim.setClaimDate(LocalDate.parse(claimsDto.getDate(),formatter));
	
		return policyService.addClaimToPolicy(claim, policyId);
	}
	
	@GetMapping("/ClaimsByPolicy/{policyId}")
	public List<Claim> getClaimsByPolicyId(@PathVariable("policyId") int policyId) {
		return policyService.getClaimsByPolicy(policyId);
	}
	
	@PostMapping("/PolicyByUser/{userid}")
	public Policy addPolicyByUserId(PolicyDto policyDto, @PathVariable("userid") int userId) {
		
		Plan plan = new Plan();
		plan.setAmount(policyDto.getAmount());
		plan.setPlanType(policyDto.getPlanType());
		plan.setYear(policyDto.getYear());
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleModel(policyDto.getVehicleModel());
		vehicle.setVehicleType(policyDto.getVehicleType());
		vehicle.setManufacturer(policyDto.getManufacturer());
		vehicle.setDrivingLicense(policyDto.getDrivingLicense());
		vehicle.setRegistrationNumber(policyDto.getRegistrationNumber());
		vehicle.setEngineNumber(policyDto.getEngineNumber());
		vehicle.setChasisNumber(policyDto.getChasisNumber());
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		vehicle.setPurchaseDate(LocalDate.parse(policyDto.getPurchaseDate(),formatter));
		
		
        vehicle.setRcDocument(policyDto.getRcDocument());
                
		return userService.addPolicyToUser(plan, vehicle, userId);
		
//		try {
//			Plan plan = new Plan();
//			plan.setAmount(policyDto.getAmount());
//			plan.setPlanType(policyDto.getPlanType());
//			plan.setYear(policyDto.getYear());
//			
//			Vehicle vehicle = new Vehicle();
//			vehicle.setVehicleModel(policyDto.getVehicleModel());
//			vehicle.setVehicleType(policyDto.getVehicleType());
//			vehicle.setManufacturer(policyDto.getManufacturer());
//			vehicle.setDrivingLicense(policyDto.getDrivingLicense());
//			vehicle.setRegistrationNumber(policyDto.getRegistrationNumber());
//			vehicle.setEngineNumber(policyDto.getEngineNumber());
//			vehicle.setChasisNumber(policyDto.getChasisNumber());
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//			vehicle.setPurchaseDate(LocalDate.parse(policyDto.getPurchaseDate(),formatter));
//			
//			return userService.addPolicyToUser(plan, vehicle, userId);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			return null;
//		}
	}
	
	@GetMapping("/PolicyByUser/{userid}")
	public List<Policy> getPolicyByUserId(@PathVariable("userid") int userId) {
		return policyService.getUserPolicyInfo(userId);
	}
	
	@PostMapping("/Login")
	public StatusDto validateUser(@RequestBody UserDto userDto) {
		StatusDto statusDto = new StatusDto();
		User user = userService.validateUserLogin(userDto.getEmail(), userDto.getPassword());
		
		if (user!=null)
		{
			statusDto.setStatus(StatusType.SUCCESS);
			statusDto.setMessage(Integer.toString(user.getUserId()));
			statusDto.setUserName(user.getName());
			return statusDto;
		}
		
		statusDto.setStatus(StatusType.FAILED);
		statusDto.setMessage("invalid credentials");
		return statusDto;
	}
	

//	@PostMapping("/renewUser/{userid}/{policyid}")
//	public Plan renewPolicy(@RequestBody Plan plan, @PathVariable("userid") int userId, @PathVariable("policyid") int policyId) {
//	try {
//		Plan newPlan=new Plan();
//		Policy policy=userService.findPolicyById(policyId);
//		newPlan.setPlanId(policy.getPlan().getPlanId());
//		newPlan.setPlanType(plan.getPlanType());
//		newPlan.setAmount(plan.getAmount());
//		newPlan.setYear(plan.getYear());
//		
//		return userService.renewPolicyByUser(userId, policyId, newPlan);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		//e.printStackTrace();
//		return null;
//	}
//	    
//	}
	
	@PutMapping("/Policy/{policyid}")  //body should take only "planType"
	public StatusDto renewPolicy(@RequestBody PolicyDto planTypeDto, @PathVariable("policyid") int policyId) {
		return userService.renewPolicy(policyId, planTypeDto.getPlanType());
	}
	
	@GetMapping("/viewClaims")
	public List<ClaimsDto> getAllClaims() {
		List<Claim> claims=adminService.getAllClaims();
		
		List<ClaimsDto> claimDtos = new ArrayList<ClaimsDto>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		for (Claim c : claims) {
			ClaimsDto claim = new ClaimsDto();
			claim.setAmount(c.getAmount());
			claim.setPolicyId(c.getPolicy().getPolicyId());
			claim.setClaimId(c.getClaimId());
			claim.setDate(c.getClaimDate().format(formatter));
			claim.setReason(c.getReason());
			claim.setResponse(c.getResponse());
			claimDtos.add(claim);
		}
		return claimDtos;
	}
	
	@PostMapping("/AdminLogin")
	public StatusDto validateUser(@RequestBody Admin adminDto) {
		StatusDto statusDto = new StatusDto();

		Admin admin=adminService.isValidAdmin(adminDto.getEmail(), adminDto.getPassword());
		if (admin!=null)
		{
			statusDto.setStatus(StatusType.SUCCESS);
			statusDto.setMessage(Integer.toString(admin.getAdminId()));
			statusDto.setUserName(admin.getAdminName());
			return statusDto;
		}
		
		statusDto.setStatus(StatusType.FAILED);
		statusDto.setMessage("invalid credentials");
		return statusDto;
	}
	
	@PostMapping("/Admin")
	public Admin addAdminCredentials(@RequestBody Admin admin) {
		System.out.println(admin.getEmail()+" "+admin.getPassword());
		return adminService.insertAdminCredentials(admin);
	}
	
	@PostMapping("/setClaim")

	public Claim setClaimAmount(@RequestBody ClaimsDto claimsDto) {
		
		Claim claim = adminService.getClaimById(claimsDto.getClaimId());

		claim.setAmount(claimsDto.getAmount());
		claim.setResponse(claimsDto.getResponse());
		return adminService.setClaimAmmount(claim);
	}
	
	@PutMapping("/Parameter")
	public StatusDto setParameter(@RequestBody Parameter parameters) {
		
		StatusDto statusDto = new StatusDto();
		statusDto.setStatus(StatusType.FAILED);
		
		String key = parameters.getKey();
		double val = parameters.getValue();
		
		if (key==null) {
			statusDto.setMessage("Key missing");
			return statusDto;
		}
		
		Parameter parameter = adminService.setParameter(key,val);
		
		if (parameter==null) {
			statusDto.setMessage("Error while entering parameter");
			return statusDto;
		}
		
		statusDto.setStatus(StatusType.SUCCESS);
		statusDto.setMessage("Key "+key+" updated with value "+val);
		return statusDto;
	}
	
	@GetMapping("/Parameter/{paramKey}")
	public Parameter getParameter(@PathVariable("paramKey") String paramKey) {
		return adminService.getParameter(paramKey);
	}
	
	@PostMapping("/Estimate")
	public AmountDto getEstimate(@RequestBody CalculateDetailsDto detailsDto) {
		double premiumEstimate = policyService.getPremiumEstimate(detailsDto.getPlanType(), detailsDto.getVehicleType(), detailsDto.getVehicleValue(), detailsDto.getAgeInYears());
		
		AmountDto dto = new AmountDto();
		dto.setAmount(premiumEstimate);
		return dto;
	}
	
	@PostMapping("/Manufacturer")
	public VehicleManufacturer addManufacturer(@RequestBody VehicleDetailsDto vehicleDetailsDto) {
		VehicleManufacturer manufacturer = new VehicleManufacturer();
		String vehicleType = vehicleDetailsDto.getType().toLowerCase();
		System.out.println(vehicleType+" "+vehicleDetailsDto.getName()+" "+vehicleType.equalsIgnoreCase("bike")+" "+vehicleType.equalsIgnoreCase("car"));
		if (!vehicleType.equalsIgnoreCase("car") && !vehicleType.equalsIgnoreCase("bike")) return null;
		manufacturer.setType(vehicleType);
		manufacturer.setName(vehicleDetailsDto.getName());
		System.out.println(vehicleType+" "+vehicleDetailsDto.getName()+" "+"abcd");
		return vehicleService.addManufacturer(manufacturer);
	}
	
	
	@PostMapping("/ModelByManufacturer/{manufid}")
	public VehicleModel addModelByManufacturer(@RequestBody VehicleDetailsDto vehicleDetailsDto, @PathVariable("manufid") int manufacturerId) {
		VehicleModel model = new VehicleModel();
		model.setValue(vehicleDetailsDto.getValue());
		model.setName(vehicleDetailsDto.getName().toLowerCase());
		
		return vehicleService.addModelByManufacturer(model, manufacturerId);
	}
	
	
	@GetMapping("/Manufacturer/{type}")
	public List<VehicleManufacturer> addManufacturer( @PathVariable("type") String vehicleType) {
		return vehicleService.getAllManufacturersByType(vehicleType);
	}
	
	@GetMapping("/ModelByManufacturer/{manufid}")
	public List<VehicleModel> getModelsByManufacturer( @PathVariable("manufid") int manufacturerId) {
		return vehicleService.getModelsByManufacturer(manufacturerId);
	}
	
	@PostMapping("/BuyAmount")
	public AmountDto getBuyAmount(@RequestBody BuyAmountDetailsDto detailsDto) {
		double premiumEstimate = policyService.getBuyAmount(detailsDto.getPlanType(), detailsDto.getVehicleType(), detailsDto.getSelectedVehicleModelId(), detailsDto.getPurchaseDate(),detailsDto.getYearsOfInsuranceSelected());
		AmountDto dto = new AmountDto();
		dto.setAmount(premiumEstimate);
		return dto;
	}
	
	@PostMapping("/RenewAmount/{policyId}")
	public AmountDto getRenewAmount( @RequestBody PolicyDto planTypeDto, @PathVariable("policyId") int policyId) {
		double premiumEstimate = policyService.getRenewAmount(policyId, planTypeDto.getPlanType());
		AmountDto dto = new AmountDto();
		dto.setAmount(premiumEstimate);
		return dto;
	}
	
	@GetMapping("/vehicle/{policyId}")
	public Vehicle getVehicleByPolicyId(@PathVariable("policyId") int policyId) {
		return policyService.getVehicleByPolicyId(policyId);
	}
	
	@GetMapping("/plan/{policyId}")
	public Plan getPlanByPolicyId( @PathVariable("policyId") int policyId) {
		return policyService.getPlanByPolicy(policyId);
	}
	
	@GetMapping("/claim/{claimId}")
	public Claim getClaimById(@PathVariable("claimId") int claimId) {
		return adminService.getClaimById(claimId);
	}
	
	@PostMapping("/rcUpload")
	public StatusDto upload(DocumentsUploaded documentDto) {
//		int userId=documentDto.getUserId();
		String docUploadLocation = "F:/project-(general insurance)/uploads/";
		String uploadedFileName = documentDto.getVehicleRC().getOriginalFilename();      /// update polcyDto
		String newFileName = documentDto.getUserId() + "-" + uploadedFileName;
        String targetFileName = docUploadLocation + newFileName;
		try {
			FileCopyUtils.copy(documentDto.getVehicleRC().getInputStream(), new FileOutputStream(targetFileName));
		
		} catch(IOException e) {
			e.printStackTrace(); //hoping no error would occur
			StatusDto status = new StatusDto();
			status.setStatus(StatusType.FAILED);
			status.setMessage("File upload failed!");
			System.out.println("failed");
		}
		StatusDto status = new StatusDto();
		status.setStatus(StatusType.SUCCESS);
		status.setMessage(newFileName);
		System.out.println("file name");
        return status;
	}
	@GetMapping("/pdf/rc/{policyId}")
	public void getRC(@PathVariable("policyId") int id,
			                             HttpServletRequest request,
			                             HttpServletResponse response) {
//		Vehicle vehicle=policyService.getVehicleByPolicyId(id);
		Vehicle vehicle=policyService.getVehicleByPolicyId(id);
		String projPath = request.getServletContext().getRealPath("/");
		String tempDownloadPath = projPath + "/downloads/";
		
		File f = new File(tempDownloadPath);
		if(!f.exists())
			f.mkdir();

		String targetFile = tempDownloadPath + vehicle.getRcDocument();

		String uploadedImagesPath = "F:/project-(general insurance)/uploads/";
		String sourceFile = uploadedImagesPath + vehicle.getRcDocument();
		
		try {
			FileCopyUtils.copy(new File(sourceFile), new File(targetFile));
		} catch(IOException e) {
			e.printStackTrace(); //hoping for no error will occur
		}
		Path file = Paths.get(tempDownloadPath, vehicle.getRcDocument());
        if (Files.exists(file)) 
        {
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "attachment; filename="+vehicle.getRcDocument());
            try
            {
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

	}
	@GetMapping("/pdf/aadhaar/{policyId}")
	public void getUserAadhaar(@PathVariable("policyId") int id,
			                             HttpServletRequest request,
			                             HttpServletResponse response) {
//		Vehicle vehicle=policyService.getVehicleByPolicyId(id);
		User user=userService.findPolicyById(id).getUser();
		String projPath = request.getServletContext().getRealPath("/");
		String tempDownloadPath = projPath + "/downloads/";
		
		File f = new File(tempDownloadPath);
		if(!f.exists())
			f.mkdir();

		String targetFile = tempDownloadPath + user.getAadhaar();

		String uploadedImagesPath = "F:/project-(general insurance)/uploads/";
		String sourceFile = uploadedImagesPath + user.getAadhaar();
		
		try {
			FileCopyUtils.copy(new File(sourceFile), new File(targetFile));
		} catch(IOException e) {
			e.printStackTrace(); //hoping for no error will occur
		}
		Path file = Paths.get(tempDownloadPath, user.getAadhaar());
        if (Files.exists(file)) 
        {
            response.setContentType("application/pdf");
            response.addHeader("Content-Disposition", "attachment; filename="+user.getAadhaar());
            try
            {
                Files.copy(file, response.getOutputStream());
                response.getOutputStream().flush();
            } 
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }

	}
	 @GetMapping("/pdf/license/{claimId}")
	 public void downloadLicense( HttpServletRequest request, 
	                                     HttpServletResponse response, 
	                                     @PathVariable("claimId") int claimId) 
	    {
	        //http://localhost:8080/pdf/{{fileName}}
		 
//		 String dataDirectory = request.getServletContext().getRealPath("/");
		 Claim claim=adminService.getClaimById(claimId);
		 String fileName=claim.getLicense();
		 String projPath = request.getServletContext().getRealPath("/");
			String tempDownloadPath = projPath + "downloads/";
			
			File f = new File(tempDownloadPath);
			if(!f.exists())
				f.mkdir();

			String targetFile = tempDownloadPath + fileName;

			String uploadedImagesPath = "F:/project-(general insurance)/uploads/";
			String sourceFile = uploadedImagesPath + fileName;
			
			try {
				FileCopyUtils.copy(new File(sourceFile), new File(targetFile));
			} catch(IOException e) {
				e.printStackTrace(); //hoping for no error will occur
			}

//		 String dataDirectory="F:/project-(general insurance)/uploads/";
			System.out.println(tempDownloadPath);
	        Path file = Paths.get(tempDownloadPath, fileName);
	        if (Files.exists(file)) 
	        {
	            response.setContentType("application/pdf");
	            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
	            try
	            {
	                Files.copy(file, response.getOutputStream());
	                response.getOutputStream().flush();
	            } 
	            catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }

	    }


	 @GetMapping("/pdf/{fileName:.+}")
	 public void downloadPDFResource( HttpServletRequest request, 
	                                     HttpServletResponse response, 
	                                     @PathVariable("fileName") String fileName) 
	    {
	        //http://localhost:8080/pdf/{{fileName}}
		 
//		 String dataDirectory = request.getServletContext().getRealPath("/");
		 String projPath = request.getServletContext().getRealPath("/");
			String tempDownloadPath = projPath + "downloads/";
			
			File f = new File(tempDownloadPath);
			if(!f.exists())
				f.mkdir();

			String targetFile = tempDownloadPath + fileName;

			String uploadedImagesPath = "F:/project-(general insurance)/uploads/";
			String sourceFile = uploadedImagesPath + fileName;
			
			try {
				FileCopyUtils.copy(new File(sourceFile), new File(targetFile));
			} catch(IOException e) {
				e.printStackTrace(); //hoping for no error will occur
			}

//		 String dataDirectory="F:/project-(general insurance)/uploads/";
			System.out.println(tempDownloadPath);
	        Path file = Paths.get(tempDownloadPath, fileName);
	        if (Files.exists(file)) 
	        {
	            response.setContentType("application/pdf");
	            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
	            try
	            {
	                Files.copy(file, response.getOutputStream());
	                response.getOutputStream().flush();
	            } 
	            catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }

	    }

	
	@PostMapping("/addOtp")
	public StatusDto addOtp(@RequestBody OtpDto otpDto) {
		return userService.addOtpByUserId(otpDto.getEmail());
	}
	
	
	@PostMapping("/verifyOtp")
	public StatusDto verifyOtp(@RequestBody OtpDto otpDto) {
		return userService.verifyOtp(otpDto.getEmail(), otpDto.getOtp());
	}
	
	@PutMapping("/changePassword")
	public StatusDto updateUserPasswordByEmailId(@RequestBody UserDto dto) {
		return userService.updateUserPasswordByEmail(dto.getEmail(), dto.getPassword());
	}
	
	@GetMapping("/User/{userId}")
	public User getUserById( @PathVariable("userId") int userId) {
		return userService.findUserById(userId);
	}
	
	@GetMapping("/Parameter")
	public List<Parameter> getAllParameters() {
		return adminService.getAllParameter();
	}
	
	@GetMapping("/export/pdf/{policyId}")
	public void exportToPdf(HttpServletResponse response,
			                 @PathVariable("policyId") int id) 
			                		 throws DocumentException , IOException {
		response.setContentType("application/pdf");
		String headerKey ="Content-Disposition";
		String headerValue="attachment; filename = invoice.pdf";
		response.setHeader(headerKey, headerValue);
		Vehicle vehicle=policyService.getVehicleByPolicyId(id);
		Plan plan=policyService.getPlanByPolicy(id);
		User user=userService.findPolicyById(id).getUser();
		PDFExporter exporter=new PDFExporter(vehicle,plan,user);
		exporter.export(response);
	}

	@PostMapping("/contact")
	public StatusDto contact(@RequestBody ContactDto contactDto) {
		StatusDto statusDto=adminService.sendMailToUser(contactDto);
		adminService.sendMailToAdmin(contactDto);
		return statusDto;
	}
}
