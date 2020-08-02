package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import com.dto.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.datasource.OracleDataSource;

@Service
public class RequestService {

	private Logger logger = Logger.getLogger(RequestService.class.getName());

	public List<Header> getRequest() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(OracleDataSource.getDataSource());



		String sqlSelect = "SELECT * FROM headers";
		List<Header> listHeaders = jdbcTemplate.query(sqlSelect, new RowMapper<Header>() {

			public Header mapRow(ResultSet result, int rowNum) throws SQLException {
				Header header = new Header();
				header.setToday_date(result.getString("TODAY_DATE"));
				header.setLoc_number(result.getString("LOC_NUMBER"));
				header.setGroup_status_cd(result.getString("GROUP_STATUS_CD"));
				header.setGroup_status_date(result.getString("GROUP_STATUS_DATE"));
				header.setProcess_prd(result.getString("PROCESS_PRD"));
				header.setUser_id_num(result.getString("USER_ID_NUM"));
				header.setGroup_num_type(result.getString("GROUP_NUM_TYPE"));
				header.setGroup_seq_num(result.getString("GROUP_SEQ_NUM"));
				header.setSeq_num(result.getString("SEQ_NUM"));
				header.setReq_u_num(result.getString("REQ_U_NUM"));
				header.setPrss_code(result.getString("PRSS_CODE"));
				header.setPrss_code_emp(result.getString("PRSS_CODE_EMP"));
				header.setPrss_code_dt(result.getString("PRSS_CODE_DT"));
				header.setOld_group_num_type(result.getString("OLD_GROUP_NUM_TYPE"));
				header.setOld_group_seq_num(result.getString("OLD_GROUP_SEQ_NUM"));
				header.setOld_wk_unit(result.getString("OLD_WK_UNIT"));
				header.setOld_u_num(result.getString("OLD_U_NUM"));
				header.setOld_loc_num(result.getString("OLD_LOC_NUM"));
				header.setPrim_digit(result.getString("PRIM_DIGIT"));
				header.setAbbreviation(result.getString("ABBREVIATION"));
				header.setDistrict_cd(result.getString("DISTRICT_CD"));
				header.setKey(result.getString("KEY"));
				header.setKey2(result.getString("KEY2"));
				header.setCategory1(result.getString("CATEGORY1"));
				header.setCategory2(result.getString("CATEGORY2"));
				header.setPrt_ssn(result.getString("PRT_SSN"));
				header.setPrt_name(result.getString("PRT_NAME"));
				header.setText1(result.getString("TEXT1"));
				header.setM31(result.getString("M31"));
				header.setSsn(result.getString("SSN"));
				header.setYear(result.getString("YEAR"));
				logger.info(header.toString());
				return header;
			}
		});

		return listHeaders;

	}


	public List<Coresponse> getCorRequest(RequestDto requestDto) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(OracleDataSource.getDataSource());



		String sqlSelect = "SELECT * FROM CORECSPONDSE WHERE SSN='"+requestDto.getSSN()+"'AND YEAR='"+requestDto.getProcess_year()+"'";
		List<Coresponse> listCoresponses = jdbcTemplate.query(sqlSelect, new RowMapper<Coresponse>() {

			public Coresponse mapRow(ResultSet result, int rowNum) throws SQLException {
				Coresponse coresponse = new Coresponse();
				coresponse.setCoresponse_date(result.getDate("CORRESPONSE_DATE"));
				coresponse.setCoresponse_type(result.getString("CORRESPONSE_TYPE"));

				coresponse.setNotice_code(result.getString("NOTICE_CODE"));
				coresponse.setDelete_ind(result.getString("DELETE_IND"));
				coresponse.setUndel_ind(result.getString("UNDEL_IND"));
				coresponse.setRecipient(result.getString("RECIPIENT"));
				coresponse.setDelivert_st(result.getString("DELIVERTY_ST"));
				coresponse.setUser(result.getString("USERS"));
				coresponse.setSsn(result.getString("SSN"));
				coresponse.setYear(result.getString("YEAR"));
				logger.info(coresponse.toString());
				return coresponse;
			}
		});

		return listCoresponses;

	}


	public List<History> getHisRequest(RequestDto requestDto) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(OracleDataSource.getDataSource());



		String sqlSelect = "SELECT * FROM HISTORY WHERE SSN='"+requestDto.getSSN()+"'AND YEAR='"+requestDto.getProcess_year()+"'";
		List<History> listHistories = jdbcTemplate.query(sqlSelect, new RowMapper<History>() {

			public History mapRow(ResultSet result, int rowNum) throws SQLException {
				History history = new History();
				history.setProcess_code(result.getString("PROCESS_CODE"));

				history.setUid_number(result.getString("UID_NUMBER"));
				history.setProcess_cd_date(result.getDate("PROCESS_DATE"));
				history.setDeadline__date(result.getString("DUE_DATE"));
				history.setSsn(result.getString("SSN"));
				history.setYear(result.getString("YEAR"));
				logger.info(history.toString());
				return history;
			}
		});

		return listHistories;

	}

	public List<Header> getRequest(RequestDto requestDto) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(OracleDataSource.getDataSource());

		String sqlSelect = "SELECT * FROM headers WHERE SSN='"+requestDto.getSSN()+"'AND YEAR='"+requestDto.getProcess_year()+"'";
		List<Header> listHeaders = jdbcTemplate.query(sqlSelect, (result, rowNum) -> {

			Header header = new Header();
			header.setToday_date(result.getString("TODAY_DATE"));
			header.setLoc_number(result.getString("LOC_NUMBER"));
			header.setGroup_status_cd(result.getString("GROUP_STATUS_CD"));
			header.setGroup_status_date(result.getString("GROUP_STATUS_DATE"));
			header.setProcess_prd(result.getString("PROCESS_PRD"));
			header.setUser_id_num(result.getString("USER_ID_NUM"));
			header.setGroup_num_type(result.getString("GROUP_NUM_TYPE"));
			header.setGroup_seq_num(result.getString("GROUP_SEQ_NUM"));
			header.setSeq_num(result.getString("SEQ_NUM"));
			header.setReq_u_num(result.getString("REQ_U_NUM"));
			header.setPrss_code(result.getString("PRSS_CODE"));
			header.setPrss_code_emp(result.getString("PRSS_CODE_EMP"));
			header.setPrss_code_dt(result.getString("PRSS_CODE_DT"));
			header.setOld_group_num_type(result.getString("OLD_GROUP_NUM_TYPE"));
			header.setOld_group_seq_num(result.getString("OLD_GROUP_SEQ_NUM"));
			header.setOld_wk_unit(result.getString("OLD_WK_UNIT"));
			header.setOld_u_num(result.getString("OLD_U_NUM"));
			header.setOld_loc_num(result.getString("OLD_LOC_NUM"));
			header.setPrim_digit(result.getString("PRIM_DIGIT"));
			header.setAbbreviation(result.getString("ABBREVIATION"));
			header.setDistrict_cd(result.getString("DISTRICT_CD"));
			header.setKey(result.getString("KEY"));
			header.setKey2(result.getString("KEY2"));
			header.setCategory1(result.getString("CATEGORY1"));
			header.setCategory2(result.getString("CATEGORY2"));
			header.setPrt_ssn(result.getString("PRT_SSN"));
			header.setPrt_name(result.getString("PRT_NAME"));
			header.setText1(result.getString("TEXT1"));
			header.setM31(result.getString("M31"));
			header.setSsn(result.getString("SSN"));
			header.setYear(result.getString("YEAR"));

			logger.info(header.toString());
			return header;
		});

		return listHeaders;

	}

	public Object getPageRequest(PageDto pageDto) {
		Object obj = new Object();
		return obj;
	}

	public List<UserDto> getUserLogin(UserDto user) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(OracleDataSource.getDataSource());



		String sqlSelect = "SELECT * FROM USERS WHERE NAME='"+user.getName()+"' AND PASSWORD='"+user.getPassword()+"'";
		List<UserDto> listUsers = jdbcTemplate.query(sqlSelect, new RowMapper<UserDto>() {

			public UserDto mapRow(ResultSet result, int rowNum) throws SQLException {
				UserDto user = new UserDto();
				user.setName(result.getString("NAME"));

				user.setPassword(result.getString("PASSWORD"));

				logger.info(user.toString());
				return user;
			}
		});

		return listUsers;
	}
}
