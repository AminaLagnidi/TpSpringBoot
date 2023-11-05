package ma.projet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.projet.dao.IDao;
import ma.projet.entities.Filiere;
import ma.projet.entities.Student;
import ma.projet.repository.StudentRepository;
@Service
public class StudentService implements IDao<Student>  {

	@Autowired
	private StudentRepository repository;
	@Override
	public Student create(Student o) {
	
		return repository.save(o);
	}

	@Override
	public boolean delete(Student o) {
		try {
			repository.delete(o);
			return true;
		} catch (Exception e) {
		  return false;
		}
	}

	@Override
	public Student update(Student o) {
		// TODO Auto-generated method stub
		return repository.save(o);
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	public List<Student> findByFiliere(Filiere filiere) {
		return repository.findByFiliere(filiere);
	}

}
