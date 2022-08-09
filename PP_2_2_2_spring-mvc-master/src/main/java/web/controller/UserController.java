package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.Model.User;
import web.dao.UserDAO;
import web.dao.UserDaoHibernateImpl;

import java.util.List;
@Controller
@RequestMapping("/users")
public class UserController {

    private final UserDAO userDao;

    @Autowired
    public UserController(UserDaoHibernateImpl userDao) {
        this.userDao = userDao;
    }

    @GetMapping()
    public String index(ModelMap model) {
        List<User> user = userDao.getUsers();
        model.addAttribute("user", user);
        return "/index";
    }

    @GetMapping("/{id}")
    public String oneUser(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userDao.getById(id));
        return "user";
    }

    @GetMapping("/new")
    public String newUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userDao.save(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable("id") int id) {
        model.addAttribute("user", userDao.getById(id));
        return "/edit";
    }

    @PatchMapping("{id}")
    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userDao.update(id, user);
        return "redirect:/users";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        userDao.delete(id);
        return "redirect:/users";
    }
}
